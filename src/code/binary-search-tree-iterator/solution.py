# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class BSTIterator:

    def __init__(self, root: TreeNode):
        self.lst = []
        self.index = 0
        if root:
            st = [root]
            while len(st) > 0:
                x = st.pop()
                self.lst.append(x.val)
                if x.left: st.append(x.left)
                if x.right: st.append(x.right)
            self.lst = sorted(self.lst)
            print(self.lst)

    def next(self) -> int:
        """
        @return the next smallest number
        """
        x = self.lst[self.index]
        self.index += 1
        return x

    def hasNext(self) -> bool:
        """
        @return whether we have a next smallest number
        """
        if len(self.lst) == 0: return False
        if self.index < len(self.lst):
            return True
        return False

# Your BSTIterator object will be instantiated and called as such:
# obj = BSTIterator(root)
# param_1 = obj.next()
# param_2 = obj.hasNext()