package io.xkniu.github.leetcode;

/**
 * #92, https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }

        // skip m - 1
        ListNode rangePre = null;
        ListNode rangeTail = head;
        for (int i = m - 1; i > 0; i--) {
            rangePre = rangeTail;
            rangeTail = rangeTail.next;
        }

        ListNode pre = null;
        ListNode cur = rangeTail;
        int reverseCount = n - m + 1;
        while (cur != null && reverseCount > 0) {
            ListNode tNext = cur.next;
            cur.next = pre;

            pre = cur;
            cur = tNext;
            reverseCount--;
        }

        if (rangePre != null) {
            rangePre.next = pre;
        } else {
            head = pre;
        }
        rangeTail.next = cur;

        return head;
    }
}
