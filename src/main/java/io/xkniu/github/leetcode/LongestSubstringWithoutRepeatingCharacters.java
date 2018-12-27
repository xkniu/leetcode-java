package io.xkniu.github.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * #3, https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> indexByChar = new HashMap<>();
        int start = 0;
        // [start + max >= i] is always true, means the remainders are enough to get [max + 1]
        for (int i = 0; start + max < s.length(); ++i) {
            Integer preIndex = indexByChar.get(s.charAt(i));
            if (preIndex != null && preIndex >= start) {
                start = preIndex + 1;
            } else {
                max = Math.max(i - start + 1, max);
            }
            indexByChar.put(s.charAt(i), i);
        }
        return max;
    }

    // When data size is small, using "indexOf" may be better than hashmap
    public int lengthOfLongestSubstring2(String s) {
        int max = 0;
        int start = 0;
        // [start + max >= i] is always true, means the remainders are enough to get [max + 1]
        for (int i = 0; start + max < s.length(); ++i) {
            int preIndex = s.indexOf(s.charAt(i), start);
            if (preIndex != i) {
                start = preIndex + 1;
            } else {
                max = Math.max(i - start + 1, max);
            }
        }
        return max;
    }
}
