/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> neighbors;
    Node() {
        val = 0;
        neighbors = vector<Node*>();
    }
    Node(int _val) {
        val = _val;
        neighbors = vector<Node*>();
    }
    Node(int _val, vector<Node*> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/

class Solution {
public:
    Node* arr[101];
    Node* cloneGraph(Node* node) {
        if (node == nullptr) {
            return nullptr;
        }
        if (arr[node->val] != 0) {
            return arr[node->val];
        }
        arr[node->val] = new Node(node->val);
        int ns = node->neighbors.size();
        for(int i=0; i<ns; i++) {
            Node* cloned = cloneGraph(node->neighbors[i]);
            arr[node->val]->neighbors.push_back(cloned);
        }
        return arr[node->val];
    }
};