/**
 * Definition for a binary tree node.
 */
function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var zigzagLevelOrder = function(root) {
    if (root === null) return [];
    const queue = [root];
    const res = [];
    let order = true;
    while (queue.length > 0) {
        const list = [];
        const size = queue.length;
        for(let i=0; i<size; i++) {
            const el = queue.shift();
            if (order) list.push(el.val);
            else list.unshift(el.val);
            if (el.left !== null) queue.push(el.left);
            if (el.right !== null) queue.push(el.right);
        }
        res.push(list);
        order = !order;
    }
    return res;
};