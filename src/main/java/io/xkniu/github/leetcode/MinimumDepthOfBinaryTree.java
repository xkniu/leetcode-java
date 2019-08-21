package io.xkniu.github.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * #111, https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left != 0 && right != 0) {
            return Math.min(left, right) + 1;
        } else {
            return left + right + 1;
        }
    }

    public int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);

        int level = 0;
        while (!deque.isEmpty()) {
            int count = deque.size();

            for (int i = 0; i < count; i++) {
                TreeNode treeNode = deque.removeFirst();
                if (treeNode.left == null && treeNode.right == null) {
                    return level + 1;
                }
                if (treeNode.left != null) {
                    deque.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.addLast(treeNode.right);
                }
            }
            level++;
        }
        return level + 1;
    }
}
