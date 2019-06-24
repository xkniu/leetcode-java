package io.xkniu.github.leetcode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 想写就写，佛系 test...对于比较难构造的 case，直接用 leetcode 页面进行测试
 */
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
        assertThat(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}))
            .isEqualTo("fl");
        assertThat(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"})).isEqualTo("");
    }

    @Test
    public void test20() {
        ValidParentheses solution = new ValidParentheses();
        assertThat(solution.isValid("()")).isEqualTo(true);
        assertThat(solution.isValid("()[]{}")).isEqualTo(true);
        assertThat(solution.isValid("(]")).isEqualTo(false);
        assertThat(solution.isValid("([)]")).isEqualTo(false);
        assertThat(solution.isValid("{[]}")).isEqualTo(true);
        assertThat(solution.isValid("((")).isEqualTo(false);

        assertThat(solution.isValid1("()")).isEqualTo(true);
        assertThat(solution.isValid1("()[]{}")).isEqualTo(true);
        assertThat(solution.isValid1("(]")).isEqualTo(false);
        assertThat(solution.isValid1("([)]")).isEqualTo(false);
        assertThat(solution.isValid1("{[]}")).isEqualTo(true);
        assertThat(solution.isValid1("((")).isEqualTo(false);
    }

    @Test
    public void test21() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        // too lazy to prepare test data
    }

    @Test
    public void test26() {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        assertThat(solution.removeDuplicates(new int[]{})).isEqualTo(0);
        assertThat(solution.removeDuplicates(new int[]{1, 1, 2})).isEqualTo(2);
        assertThat(solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})).isEqualTo(5);
        assertThat(solution.removeDuplicates(new int[]{1, 2})).isEqualTo(2);
        assertThat(solution.removeDuplicates(new int[]{1, 2, 2})).isEqualTo(2);
    }

    @Test
    public void test27() {
        RemoveElement solution = new RemoveElement();
        assertThat(solution.removeElement(new int[]{3, 2, 2, 3}, 3)).isEqualTo(2);
        assertThat(solution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2)).isEqualTo(5);
    }

    @Test
    public void test28() {
        ImplementStrStr solution = new ImplementStrStr();
        assertThat(solution.strStr("ohayou", "")).isEqualTo(0);
        assertThat(solution.strStr("hello", "ll")).isEqualTo(2);
        assertThat(solution.strStr("aaaaa", "bba")).isEqualTo(-1);
    }

    @Test
    public void test35() {
        SearchInsertPosition solution = new SearchInsertPosition();
        assertThat(solution.searchInsert(new int[]{1, 3, 5, 6}, 5)).isEqualTo(2);
        assertThat(solution.searchInsert(new int[]{1, 3, 5, 6}, 2)).isEqualTo(1);
        assertThat(solution.searchInsert(new int[]{1, 3, 5, 6}, 7)).isEqualTo(4);
        assertThat(solution.searchInsert(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);

        assertThat(solution.searchInsert1(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
        assertThat(solution.searchInsert1(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
        assertThat(solution.searchInsert1(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
        assertThat(solution.searchInsert1(new int[]{1, 3, 5, 6}, 0)).isEqualTo(0);
    }

    @Test
    public void test162() {
        FindPeakElement solution = new FindPeakElement();
        assertThat(solution.findPeakElement(new int[]{1,2,3,1})).isEqualTo(2);
        assertThat(solution.findPeakElement(new int[]{1,2,1,3,5,6,4})).isEqualTo(5);
    }
}