package io.xkniu.github.leetcode;

/**
 * #160, https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class IntersectionOfTwoLinkedLists {

    /**
     * 遍历完自己的节点后，从另一条头开始遍历，这样到交点时，遍历的长度相同，会一起到交点。
     * 对于不想交的节点，会一起遍历到第二遍/第一遍的 null 节点。
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode l1 = headA;
        ListNode l2 = headB;
        while (l1 != l2) {
            // 当没有交点的时候，以下实现会死循环，必须要共同遍历下最后的 null 节点
//            l1 = l1.next != null ? l1.next : headB;
//            l2 = l2.next != null ? l2.next : headA;

            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA : l2.next;
        }
        return l1;
    }
}
