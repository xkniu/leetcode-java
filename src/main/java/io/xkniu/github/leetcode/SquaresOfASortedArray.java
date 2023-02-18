package io.xkniu.github.leetcode;

/**
 * #977, https://leetcode.cn/problems/squares-of-a-sorted-array/
 */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int index = result.length - 1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }
}
