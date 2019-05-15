package io.xkniu.github.leetcode;

/**
 * #167, https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumII {

    /**
     * 边界的移动是在排除不可能的结果。
     *
     * f(n, target) = f(n-1, target)，假如 left + right > target，那么所有元素和 right 相加都会大于 target，right 是可以排除
     * 掉的结果。
     */
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[] {l + 1, r + 1};
            } else if (sum < target) {
                ++l;
            } else {
                --r;
            }
        }
        return new int[] {-1, -1};
    }
}
