/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     val: number
 *     left: TreeNode | null
 *     right: TreeNode | null
 *     constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.left = (left===undefined ? null : left)
 *         this.right = (right===undefined ? null : right)
 *     }
 * }
 */

function maxPathSum(root: TreeNode | null): number {
    const maxVal = [Number.MIN_SAFE_INTEGER];
    const ret = dfs(root, maxVal);
    return maxVal[0];
};

function dfs(root: TreeNode | null, maxVal: number[]): number {
    if (root == null) return 0;
    const left = Math.max(0, dfs(root.left, maxVal));
    const right = Math.max(0, dfs(root.right, maxVal));

    maxVal[0] = Math.max(maxVal[0], left + right + root.val);
    return Math.max(left, right) + root.val;
}