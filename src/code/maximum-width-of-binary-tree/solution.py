from typing import  Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        mp, q = {}, []
        if root is None:
            return 0
        q.append(root)
        start, end, mxw = 0, 0, 0
        mp[root] = 1
        while q:
            size = len(q)
            for i in range(size):
                node = q.pop(0)
                if i == 0:
                    start = mp[node]
                if i == size-1:
                    end = mp[node]
                if node.left:
                    q.append(node.left)
                    mp[node.left] = 2*mp[node]
                if node.right:
                    q.append(node.right)
                    mp[node.right] = 2*mp[node] + 1
            mxw = max(mxw, end-start+1)
        return mxw