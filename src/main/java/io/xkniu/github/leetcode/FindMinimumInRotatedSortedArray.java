package io.xkniu.github.leetcode;

/**
 * #153, https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/
 */
public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                // [l, mid] 左侧有序，旋转点在右侧区间
                l = mid + 1;
            } else {
                // [mid + 1, r] 右侧有序，旋转点在左侧区间
                r = mid;
            }
        }

        return r >= 0 ? nums[r] : -1;
    }
}
