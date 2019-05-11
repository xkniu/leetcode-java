package io.xkniu.github.leetcode;

/**
 * #33, https://leetcode.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {

    /**
     * 特殊 case：
     *
     * - 数组可能为空数组，导致 r 越界，因此需要判断 r>=0
     */
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                // 左侧有序
                if (nums[l] <= target && nums[mid] >= target) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            } else {
                // 右侧有序
                if (nums[mid + 1] <= target && nums[r] >= target) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
        }

        return r >= 0 && nums[r] == target ? r : -1;
    }
}
