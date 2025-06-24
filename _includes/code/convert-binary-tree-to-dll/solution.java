class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class Solution {
    TreeNode prev = null;
    TreeNode head = null;

    public TreeNode convertToDLL(TreeNode root) {
        if (root == null) return null;
        inOrder(root);
        return head;
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);

        if (prev == null) {
            head = node;
        } else {
            prev.right = node;
            node.left = prev;
        }
        prev = node;

        inOrder(node.right);
    }
}
