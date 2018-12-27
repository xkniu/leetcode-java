package io.xkniu.github.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * #1, https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>((int) (nums.length / 0.75) + 1);
        for (int i = 0; i < nums.length; i++) {
            int expect = target - nums[i];
            if (map.containsKey(expect)) {
                return new int[] {map.get(expect), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
