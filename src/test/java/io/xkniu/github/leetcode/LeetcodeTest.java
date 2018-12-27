package io.xkniu.github.leetcode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeetcodeTest {

    @Test
    public void test1() {
        TwoSum solution = new TwoSum();
        assertThat(solution.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
    }

    @Test
    public void test7() {
        ReverseInteger solution = new ReverseInteger();
        assertThat(solution.reverse(123)).isEqualTo(321);
        assertThat(solution.reverse(-123)).isEqualTo(-321);
        assertThat(solution.reverse(120)).isEqualTo(21);

        assertThat(solution.reverse1(123)).isEqualTo(321);
        assertThat(solution.reverse1(-123)).isEqualTo(-321);
        assertThat(solution.reverse1(120)).isEqualTo(21);
    }

    @Test
    public void test9() {
        PalindromeNumber solution = new PalindromeNumber();
        assertThat(solution.isPalindrome(121)).isEqualTo(true);
        assertThat(solution.isPalindrome(-121)).isEqualTo(false);
        assertThat(solution.isPalindrome(10)).isEqualTo(false);

        assertThat(solution.isPalindrome1(121)).isEqualTo(true);
        assertThat(solution.isPalindrome1(-121)).isEqualTo(false);
        assertThat(solution.isPalindrome1(10)).isEqualTo(false);
    }

    @Test
    public void test13() {
        RomanToInteger solution = new RomanToInteger();
        assertThat(solution.romanToInt("III")).isEqualTo(3);
        assertThat(solution.romanToInt("IV")).isEqualTo(4);
        assertThat(solution.romanToInt("IX")).isEqualTo(9);
        assertThat(solution.romanToInt("LVIII")).isEqualTo(58);
        assertThat(solution.romanToInt("MCMXCIV")).isEqualTo(1994);
    }

    @Test
    public void test14() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        assertThat(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"})).isEqualTo("fl");
        assertThat(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"})).isEqualTo("");
    }
}