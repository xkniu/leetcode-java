package io.xkniu.github.leetcode;

/**
 * #206, https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode t = cur.next;
            cur.next = pre;

            pre = cur;
            cur = t;
        }

        return pre;
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode rHead = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return rHead;
    }
}
