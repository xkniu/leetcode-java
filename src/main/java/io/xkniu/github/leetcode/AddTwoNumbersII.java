package io.xkniu.github.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * #445, https://leetcode.com/problems/add-two-numbers-ii/description/
 */
public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        Deque<Integer> deque1 = getDeque(l1);
        Deque<Integer> deque2 = getDeque(l2);
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        while (!deque1.isEmpty() || !deque2.isEmpty() || carry != 0) {
            int sum = carry;
            if (!deque1.isEmpty()) {
                sum += deque1.pop();
            }
            if (!deque2.isEmpty()) {
                sum += deque2.pop();
            }
            carry = sum / 10;
            ListNode next = dummy.next;
            dummy.next = new ListNode(sum % 10);
            dummy.next.next = next;
        }
        return dummy.next;
    }

    private Deque<Integer> getDeque(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();

        while (head != null) {
            deque.push(head.val);
            head = head.next;
        }
        return deque;
    }
}
