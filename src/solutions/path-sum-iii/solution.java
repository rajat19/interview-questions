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
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefix = new HashMap<>();
        prefix.put(0L, 1);
        return dfs(root, targetSum, 0, prefix);
    }

    private int dfs(TreeNode root, int target, long current, Map<Long, Integer> prefix) {
        if (root == null) {
            return 0;
        }
        current += root.val;
        int count = prefix.getOrDefault(current - target, 0);
        prefix.put(current, prefix.getOrDefault(current, 0) + 1);
        count += dfs(root.left, target, current, prefix);
        count += dfs(root.right, target, current, prefix);
        prefix.put(current, prefix.getOrDefault(current, 0) - 1);

        return count;
    }
}