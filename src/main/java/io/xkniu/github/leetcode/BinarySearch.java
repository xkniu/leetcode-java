package io.xkniu.github.leetcode;

/**
 * #704, https://leetcode.cn/problems/binary-search/
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length;
        while (left < right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return -1;
    }
}
