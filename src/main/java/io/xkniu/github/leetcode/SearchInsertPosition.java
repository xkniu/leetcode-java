package io.xkniu.github.leetcode;

/**
 * #35, https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {

    /**
     * C++ STL 的 lower_bound 写法，使用前闭后开写最简洁
     *
     * 二分查找有几种写法？它们的区别是什么？ - Jason Li的回答 - 知乎
     * https://www.zhihu.com/question/36132386/answer/530313852
     */
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }

    /**
     * 同 {@code searchInsert} 的思路，使用前闭后闭区间，缩小检验区间到空。
     * 终止时，left 为满足条件 index，right 为满足条件的 index-1。
     */
    public int searchInsert1(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    /**
     * 同 {@code searchInsert} 的思路，使用前闭后闭区间，缩小搜索区间到最后的可能结果。
     * 终止时，left 为可能满足条件的 index，判断是否满足，不满足则不存在满足条件的 index，则插入数组的最后。
     */
    public int searchInsert2(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return nums[l] < target ? nums.length : l;
    }
}
