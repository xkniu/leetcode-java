package io.xkniu.github.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * #637, https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            int count = deque.size();
            // 注意 sum 需要用 long，int 可能会溢出
            long sum = 0;

            for (int i = 0; i < count; i++) {
                TreeNode treeNode = deque.removeFirst();
                sum += treeNode.val;
                if (treeNode.left != null) {
                    deque.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.addLast(treeNode.right);
                }
            }
            result.add((double) sum / count);
        }
        return result;
    }
}
