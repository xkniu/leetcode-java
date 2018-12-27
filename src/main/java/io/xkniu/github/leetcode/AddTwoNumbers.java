package io.xkniu.github.leetcode;

/**
 * #2, https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        int unitCarry = 0;
        while (l1 != null || l2 != null || unitCarry != 0) {
            int unitSum = unitCarry;
            if (l1 != null) {
                unitSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                unitSum += l2.val;
                l2 = l2.next;
            }
            unitCarry = unitSum / 10;
            pre.next = new ListNode(unitSum % 10);
            pre = pre.next;
        }
        return dummy.next;
    }

    private static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
