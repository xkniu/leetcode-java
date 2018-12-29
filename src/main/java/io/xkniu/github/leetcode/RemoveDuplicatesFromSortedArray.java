package io.xkniu.github.leetcode;

/**
 * #26, https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                // assignment is acceptable even if "++i == j"
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
