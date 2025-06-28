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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, 0, inorder.length-1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int prestart, int instart, int inend) {
        if (prestart > preorder.length || instart > inend) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[prestart]);
        int inroot = instart;
        while(inroot <= inend) {
            if (inorder[inroot] == preorder[prestart]) {
                break;
            }
            inroot++;
        }
        int count = inroot - instart;
        root.left = buildTree(preorder, inorder, prestart+1, instart, inroot-1);
        root.right = buildTree(preorder, inorder, prestart+inroot-instart+1, inroot+1, inend);
        return root;
    }
}