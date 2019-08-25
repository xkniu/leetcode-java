package io.xkniu.github.leetcode;

/**
 * #404, https://leetcode.com/problems/sum-of-left-leaves/
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (isLeaf(root.left)) {
            return sumOfLeftLeaves(root.right) + root.left.val;
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }

    private boolean isLeaf(TreeNode node) {
        if (node == null) {
            return false;
        }
        return node.left == null && node.right == null;
    }
}
