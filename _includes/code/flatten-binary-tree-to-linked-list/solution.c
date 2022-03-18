/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


void flatten(struct TreeNode* root){
    if (!root) return;
    flatten(root->left);
    flatten(root->right);
    if (!root->left) return;
    struct TreeNode* right = root->right;
    struct TreeNode* left = root->left;
    root->left = NULL;
    root->right = left;
    while(left->right != NULL) {
        left = left->right;
    }
    left->right = right;
}