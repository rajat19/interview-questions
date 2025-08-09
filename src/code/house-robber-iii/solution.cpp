/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int rob(TreeNode* root) {
        vector<int> res = robSub(root);
        return max(res[0], res[1]);
    }

    vector<int> robSub(TreeNode* root) {
        vector<int> res(2, 0);
        if (root == nullptr) {
            return res;
        }
        vector<int> left = robSub(root->left);
        vector<int> right = robSub(root->right);

        res[0] = max(left[0], left[1]) + max(right[0], right[1]);
        res[1] = root->val + left[0] + right[0];
        return res;
    }
};