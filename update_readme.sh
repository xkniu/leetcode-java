#!/usr/bin/env bash

python3 ./generate_markdown_table.py | cat readme_template.txt - > README.md