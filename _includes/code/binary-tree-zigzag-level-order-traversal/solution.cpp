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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        if (root == nullptr) return {};
        bool ltr = true;
        queue<TreeNode*> q;
        vector<vector<int>> result;
        q.push(root);
        while(!q.empty()) {
            vector<int> row;
            int qs = q.size();
            while(qs > 0) {
                TreeNode *node = q.front();
                q.pop();
                if (ltr) {
                    row.push_back(node->val);
                } else {
                    row.insert(row.begin(), node->val);
                }

                if (node->left != nullptr) q.push(node->left);
                if (node->right != nullptr) q.push(node->right);
                qs--;
            }
            result.push_back(row);
            ltr = !ltr;
        }
        return result;
    }
};