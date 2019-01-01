package io.xkniu.github.leetcode;

/**
 * #27, https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public int removeElement1(int[] nums, int val) {
        int i = 0;
        int j = nums.length;
        while (i < j) {
            if (nums[i] == val) {
                nums[i] = nums[--j];
            } else {
                i++;
            }
        }
        return i;
    }
}
