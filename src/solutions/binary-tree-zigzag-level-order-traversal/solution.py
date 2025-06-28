# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: TreeNode) -> List[List[int]]:
        if root is None: return root
        q = [(root, 0)]
        mp = {}
        while len(q) > 0:
            x, h = q.pop(0)
            if h in mp:
                mp[h].append(x.val)
            else:
                mp[h] = [x.val]
            if x.left is not None: q.append((x.left, h+1))
            if x.right is not None: q.append((x.right, h+1))
        for k,v in mp.items():
            if k%2==1:
                mp[k] = mp[k][::-1]
        return mp.values()