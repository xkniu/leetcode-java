package io.xkniu.github.leetcode;

/**
 * #9, https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }

        long xl = x;
        long r = 0;

        for (; xl != 0; xl /= 10) {
            r = 10 * r + xl % 10;
        }

        return r == x;
    }

    public boolean isPalindrome1(int x) {
        if (x == 0) {
            return true;
        } else if (x < 0 || x % 10 == 0) {
            return false;
        }

        int r = 0;
        while (x > r) {
            r = 10 * r + x % 10;
            x /= 10;
        }

        return r == x || r / 10 == x;
    }
}