/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        dfs(root,sb);
        return sb.toString();
    }

    private void dfs(TreeNode x, StringBuilder sb) {
        if (x==null) {
            sb.append("null ");
            return;
        }
        sb.append(String.valueOf(x.val));
        sb.append(' ');
        dfs(x.left,sb);
        dfs(x.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] node=data.split(" ");
        int[] d=new int[1];
        return dfs(node,d);
    }
    private TreeNode dfs(String[] node, int[] d) {
        if (node[d[0]].equals("null")) {
            d[0]++;
            return null;
        }
        TreeNode x=new TreeNode(Integer.valueOf(node[d[0]]));
        d[0]++;
        x.left=dfs(node,d);
        x.right=dfs(node,d);
        return x;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));