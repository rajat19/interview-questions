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
    public int widthOfBinaryTree(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        map.put(root, 1);
        int maxWidth = 0, start=0, end=0;
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i=0; i<n; i++) {
                TreeNode node = q.poll();
                if (i==0) start = map.get(node);
                if (i==n-1) end = map.get(node);
                if (node.left != null) {
                    q.offer(node.left);
                    map.put(node.left, 2*map.get(node));
                }
                if (node.right != null) {
                    q.offer(node.right);
                    map.put(node.right, 1 + 2*map.get(node));
                }
            }
            maxWidth = Math.max(maxWidth, end-start+1);
        }
        return maxWidth;
    }
}