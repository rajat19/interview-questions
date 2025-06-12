"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        visited = dict()
        if node is None:
            return None
        if len(node.neighbors) == 0:
            return Node(node.val)
        return self.traverse(node, visited)

    def traverse(self, old: Optional['Node'], visited: dict) -> Optional['Node']:
        if old is None:
            return None
        if old in visited:
            return visited[old]
        new = Node(old.val)
        visited[old] = new
        for neigh in old.neighbors:
            newneigh = self.traverse(neigh, visited)
            new.neighbors.append(newneigh)
        return new