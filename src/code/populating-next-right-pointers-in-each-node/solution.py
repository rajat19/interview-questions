class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next


class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        level = root
        while level is not None:
            curr = level
            while curr is not None:
                if curr.left is not None:
                    curr.left.next = curr.right
                if curr.right is not None and curr.next is not None:
                    curr.right.next = curr.next.left
                curr = curr.next
            level = level.left
        return root
