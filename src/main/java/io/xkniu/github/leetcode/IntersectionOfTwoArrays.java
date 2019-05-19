package io.xkniu.github.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * #349, https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            s2.add(i);
        }

        if (s1.size() > s2.size()) {
            Set<Integer> t = s1;
            s1 = s2;
            s2 = t;
        }

        int[] r = new int[s1.size()];
        int index = 0;

        // 不要先用 list 然后 IntStream 转为数组，时间消耗大很多
        for (Integer i : s1) {
            if (s2.contains(i)) {
                r[index++] = i;
            }
        }

        return Arrays.copyOf(r, index);
    }
}
