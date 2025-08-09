# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        def dfs(root, prefix, current):
            if not root:
                return 0

            current += root.val
            count = prefix.get(current - targetSum, 0)
            prefix[current] = prefix.get(current, 0) + 1
            count += dfs(root.left, prefix, current)
            count += dfs(root.right, prefix, current)
            prefix[current] -= 1
            return count

        prefix = {0: 1}
        return dfs(root, prefix, 0)