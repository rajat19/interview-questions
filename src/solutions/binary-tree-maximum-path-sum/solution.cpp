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
    int maxPathSum(TreeNode* root) {
        int maxVal[1] = {INT_MIN};
        maxPathDown(root, maxVal);
        return maxVal[0];
    }

    int maxPathDown(TreeNode* root, int* maxVal) {
        if (root == nullptr) return 0;
        int left = max(0, maxPathDown(root->left, maxVal));
        int right = max(0, maxPathDown(root->right, maxVal));
        maxVal[0] = max(maxVal[0], left+right+root->val);
        return max(left, right) + root->val;
    }
};