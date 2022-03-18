# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Codec:

    def serialize(self, root):
        """Encodes a tree to a single string.

        :type root: TreeNode
        :rtype: str
        """
        s = []
        self._serial(root, s)
        return ' '.join(s)

    def _serial(self, root, s):
        if not root:
            s.append("null")
            return
        s.append(str(root.val))
        self._serial(root.left, s)
        self._serial(root.right, s)

    def deserialize(self, data):
        """Decodes your encoded data to tree.

        :type data: str
        :rtype: TreeNode
        """
        pos = [0]
        arr = data.split(' ')
        return self._deserial(arr, pos)

    def _deserial(self, arr, pos):
        if arr[pos[0]] == "null":
            pos[0] += 1
            return None
        node = TreeNode(arr[pos[0]])
        pos[0] += 1
        node.left = self._deserial(arr, pos)
        node.right = self._deserial(arr, pos)
        return node

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))
