package io.xkniu.github.leetcode;

/**
 * #110, https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {

    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1) {
            result = false;
        }
        return Math.max(l, r) + 1;
    }
}
