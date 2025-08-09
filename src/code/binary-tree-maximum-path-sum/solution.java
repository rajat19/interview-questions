/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] maxVal = new int[]{Integer.MIN_VALUE};
        maxPathDown(root, maxVal);
        return maxVal[0];
    }

    private int maxPathDown(TreeNode root, int[] maxVal) {
        if (root == null) return 0;
        int left = Math.max(0, maxPathDown(root.left, maxVal));
        int right = Math.max(0, maxPathDown(root.right, maxVal));
        maxVal[0] = Math.max(maxVal[0], left+right+root.val);
        return Math.max(left, right) + root.val;
    }
}