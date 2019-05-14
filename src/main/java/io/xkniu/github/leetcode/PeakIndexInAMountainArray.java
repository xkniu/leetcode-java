package io.xkniu.github.leetcode;

/**
 * #852, https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
 */
public class PeakIndexInAMountainArray {

    /**
     * 简单二分查找
     */
    public int peakIndexInMountainArray(int[] A) {
        int l = 0;
        int r = A.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (A[mid] < A[mid+1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }
}
