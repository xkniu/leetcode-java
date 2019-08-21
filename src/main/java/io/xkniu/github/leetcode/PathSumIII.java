package io.xkniu.github.leetcode;

/**
 * #437, https://leetcode.com/problems/path-sum-iii/
 */
public class PathSumIII {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return pathSumWithRoot(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumWithRoot(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return pathSumWithRoot(root.left, sum - root.val) + pathSumWithRoot(root.right, sum - root.val) + (root.val == sum ? 1 : 0);
    }
}
