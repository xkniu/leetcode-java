package io.xkniu.github.leetcode;

/**
 * #13, https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        int r = 0;
        int pre = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int t = romanCharToInt(s.charAt(i));
            r += t >= pre ? t : -t;
            pre = t;
        }
        return r;
    }

    private int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}