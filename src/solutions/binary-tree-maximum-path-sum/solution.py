from typing import Optional, List


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        max_value = [float('-inf')]
        self.maxPathDown(root, max_value)
        return int(max_value[0])

    def maxPathDown(self, node: Optional[TreeNode], max_value: List[float]):
        if not node:
            return 0
        left = max(0, self.maxPathDown(node.left, max_value))
        right = max(0, self.maxPathDown(node.right, max_value))
        max_value[0] = max(max_value[0], left + right + node.val)
        return max(left, right) + node.val
