package io.xkniu.github.leetcode;

/**
 * #7, https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

    public int reverse(int x) {
        long xl = x;

        boolean negative = xl < 0;
        xl = negative ? -xl : xl;

        long r = 0;
        for (; xl != 0; xl /= 10) {
            r = 10 * r + xl % 10;
        }

        r = negative ? -r : r;
        r = r > 0x7fffffff ? 0 : (r < 0x80000000 ? 0 : r);
        return (int) r;
    }

    public int reverse1(int x) {
        int r = 0;
        for (; x != 0; x /= 10) {
            int t = x % 10;
            if (r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && t > 7)) {
                return 0;
            }
            if (r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && t < -8)) {
                return 0;
            }
            r = 10 * r + t;
        }
        return r;
    }
}