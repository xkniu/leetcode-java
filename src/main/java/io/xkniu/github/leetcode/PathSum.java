package io.xkniu.github.leetcode;

/**
 * #112, https://leetcode.com/problems/path-sum/
 */
public class PathSum {

    private int count = 0;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val == sum;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
