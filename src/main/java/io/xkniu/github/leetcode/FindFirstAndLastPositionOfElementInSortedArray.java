package io.xkniu.github.leetcode;

/**
 * #34, https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    /**
     * 二分查找的 lower_bound 和 upper_bound，用闭开区间最方便
     */
    public int[] searchRange(int[] nums, int target) {
        int lowerBound = bound(nums, target, false);
        int upperBound = bound(nums, target, true);

        return lowerBound == upperBound ?
            new int[] {-1, -1} : new int[] {lowerBound, upperBound - 1};
    }

    private int bound(int[] nums, int target, boolean upperBound) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target || (upperBound && nums[mid] == target)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }
}
