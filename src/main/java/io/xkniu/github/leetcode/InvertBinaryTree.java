package io.xkniu.github.leetcode;

/**
 * #226, https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode t = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(t);
        return root;
    }
}
