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
class BSTIterator {
    queue<int> q;
    void inOrder(TreeNode* root, queue<int> &q) {
        if(root == NULL){
            return;
        }
        inOrder(root->left, q);
        q.push(root->val);
        inOrder(root->right, q);
    }
public:
    BSTIterator(TreeNode* root) {
        inOrder(root, q);
    }

    int next() {
        if(!q.empty()){
            int frontNode = q.front();
            q.pop();
            return frontNode;
        }
        return 0;
    }

    bool hasNext() {
        if(!q.empty()){
            return true;
        }
        return false;
    }
};

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator* obj = new BSTIterator(root);
 * int param_1 = obj->next();
 * bool param_2 = obj->hasNext();
 */