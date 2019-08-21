package io.xkniu.github.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * #513, https://leetcode.com/problems/find-bottom-left-tree-value/
 */
public class FindBottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {
        int result = 0;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            int count = deque.size();

            for (int i = 0; i < count; i++) {
                TreeNode treeNode = deque.removeFirst();
                if (i == 0) {
                    result = treeNode.val;
                }
                if (treeNode.left != null) {
                    deque.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.addLast(treeNode.right);
                }
            }
        }
        return result;
    }
}
