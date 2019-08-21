import requests
import json
import os
import re

def get_problem_info_map():
    '''
    p_id -> (p_slug, p_title, p_difficulty)
    '''
    r = requests.get('https://leetcode.com/api/problems/all/')
    json_data = json.loads(r.text)

    r = {}
    for _ in json_data['stat_status_pairs']:
        p_id = _['stat']['frontend_question_id']
        p_slug = _['stat']['question__title_slug']
        p_title = _['stat']['question__title']
        p_difficulty = ('Easy', 'Medium', 'Hard')[_['difficulty']['level'] - 1]
        r[p_id] = (p_slug, p_title, p_difficulty)
    return r


def extract_info_from_source(file):
    '''
    (p_id, p_url, p_file)
    '''
    with open(file, 'r') as f:
        for line in f.readlines():
            data = re.match(r'\s\*\s+(#.*)', line)
            if data:
                p_info = data.group(1)
                t = p_info.split(', ')
                if len(t) == 2:
                    p_num = int(t[0].strip()[1:])
                    p_url = t[1].strip()
                    return p_num, p_url, file


def get_source_info_map(basepath):
    '''
    p_id -> (p_url, p_file)
    '''
    path = basepath if basepath.endswith(os.path.sep) else basepath + os.path.sep

    m = {}
    for file_name in os.listdir(path):
        file = os.path.join(path, file_name)
        if os.path.isfile(file) and file.endswith('.java'):
            t = extract_info_from_source(file)
            if t:
                m[t[0]] = t[1:]
    return m

# base info
source_base_path = './src/main/java/io/xkniu/github/leetcode/'
table_summary = 'Summary: {0}\n'
table_header = '| # | Title | Solution | Difficulty |\n|---| ----- | -------- | ---------- |'
table_row = '| {pid} | [{title}](https://leetcode.com/problems/{slug}/) | [Source]({source}) | {difficulty} |'

# configuration
with_summary = True
row_reversed = True

pm = get_problem_info_map()
sm = get_source_info_map(source_base_path)

table = [table_header]
summary_info = {}
for k in sorted(pm, reverse=row_reversed):
    v = pm[k]

    if k in sm:
        row = table_row.format(pid=k, title=v[1], slug=v[0], source=sm[k][1], difficulty=v[2])
        table.append(row)
        summary_info[v[2]] = summary_info.get(v[2], 0) + 1

if with_summary:
    summary = table_summary.format(summary_info)
    table.insert(0, summary)

for _ in table:
    print(_)
