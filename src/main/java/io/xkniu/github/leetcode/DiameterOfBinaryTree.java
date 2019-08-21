package io.xkniu.github.leetcode;

/**
 * #543, https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {

    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        max = Math.max(l + r, max);
        return Math.max(l, r) + 1;
    }
}
