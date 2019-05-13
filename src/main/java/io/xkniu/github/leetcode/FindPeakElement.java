package io.xkniu.github.leetcode;

/**
 * #162, https://leetcode.com/problems/find-peak-element/submissions/
 */
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int ml = l + (r - l) / 2;
            int mr = ml + 1;

            if (nums[ml] > nums[mr]) {
                // 上升趋势，右侧一定有极大值
                r = ml;
            } else {
                // 下降趋势，左侧一定有极大值
                l = mr;
            }
        }
        return r;
    }
}
