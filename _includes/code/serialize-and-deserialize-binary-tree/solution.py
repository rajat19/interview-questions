# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Codec:
    def __init__(self):
        self.separator = '#'
        self.null = 'null'

    def serialize(self, root):
        """Encodes a tree to a single string.

        :type root: TreeNode
        :rtype: str
        """
        ser = []
        self._dfs(root, ser)
        return self.separator.join(ser)

    def _dfs(self, root, ser: []):
        if root is None:
            ser.append(self.null)
            return
        ser.append(f'{root.val}')
        self._dfs(root.left, ser)
        self._dfs(root.right, ser)

    def deserialize(self, data):
        """Decodes your encoded data to tree.

        :type data: str
        :rtype: TreeNode
        """
        parsed = data.split(self.separator)
        index = [0]
        return self._deser_dfs(parsed, index)

    def _deser_dfs(self, parsed: [], index: []):
        if parsed[index[0]] == self.null:
            index[0] += 1
            return None
        node = TreeNode(parsed[index[0]])
        index[0] += 1
        node.left = self._deser_dfs(parsed, index)
        node.right = self._deser_dfs(parsed, index)
        return node


# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))