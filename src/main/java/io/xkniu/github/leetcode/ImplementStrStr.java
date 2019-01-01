package io.xkniu.github.leetcode;

/**
 * #28, https://leetcode.com/problems/implement-strstr/
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int j = 0;
            while (j < needle.length()) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
