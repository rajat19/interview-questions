from typing import List, Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        return self.helper(preorder, inorder, 0, 0, len(inorder) - 1)

    def helper(self, preorder, inorder, prestart, instart, inend):
        if prestart > len(preorder) or instart > inend:
            return None
        root = TreeNode(preorder[prestart])
        index = instart
        while index <= inend:
            if inorder[index] == preorder[prestart]:
                break
            index += 1
        root.left = self.helper(preorder, inorder, prestart+1, instart, index-1);
        root.right = self.helper(preorder, inorder, prestart+index-instart+1, index+1, inend);
        return root