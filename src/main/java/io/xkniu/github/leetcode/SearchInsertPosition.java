package io.xkniu.github.leetcode;

/**
 * #35, https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 同 C++ STL 的 lower_bound，使用前闭后开写最简洁
     */
    public int searchInsert1(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
