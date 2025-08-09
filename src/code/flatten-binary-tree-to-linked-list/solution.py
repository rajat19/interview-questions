from typing import Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def flatten(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        if root is None:
            return
        self.flatten(root.left)
        self.flatten(root.right)
        if root.left is None:
            return
        right = root.right
        left = root.left
        root.left = None
        root.right = left
        while left.right is not None:
            left = left.right
        left.right = right

