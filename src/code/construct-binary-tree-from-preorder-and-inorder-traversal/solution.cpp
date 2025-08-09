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
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        return buildTree(preorder, inorder, 0, 0, inorder.size() - 1);
    }

    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder, int prestart, int instart, int inend) {
        if (prestart > preorder.size() || instart > inend) {
            return nullptr;
        }
        TreeNode* root = new TreeNode(preorder[prestart]);
        int index = instart;
        while(index <= inend) {
            if (inorder[index] == preorder[prestart]) {
                break;
            }
            index++;
        }
        root->left = buildTree(preorder, inorder, prestart+1, instart, index-1);
        root->right = buildTree(preorder, inorder, prestart+index-instart+1, index+1, inend);
        return root;
    }
};