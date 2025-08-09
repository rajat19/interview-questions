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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();

        queue.offer(new Tuple(root, 0, 0));
        while(!queue.isEmpty()) {
            Tuple tuple = queue.poll();
            TreeNode node = tuple.node;
            int row = tuple.row;
            int col = tuple.col;

            if (!map.containsKey(row)) {
                map.put(row, new TreeMap<>());
            }
            if (!map.get(row).containsKey(col)) {
                map.get(row).put(col, new PriorityQueue<>());
            }

            map.get(row).get(col).offer(node.val);

            if (node.left != null) {
                queue.offer(new Tuple(node.left, row-1, col+1));
            }

            if (node.right != null) {
                queue.offer(new Tuple(node.right, row+1, col+1));
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> mapValues: map.values()) {
            result.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes: mapValues.values()) {
                while(!nodes.isEmpty()) {
                    result.get(result.size() - 1).add(nodes.poll());
                }
            }
        }

        return result;
    }
}

class Tuple {
    TreeNode node;
    int row;
    int col;
    Tuple(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}