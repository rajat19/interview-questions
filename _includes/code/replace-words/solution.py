class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        root = Trie()
        for word in dictionary:
            root.insert(word)

        res, split = [], sentence.split(' ')
        for word in split:
            res.append(root.search(word))

        return ' '.join(res)

class Trie:
    def __init__(self):
        self.root = TrieNode()

    def insert(self, word: str):
        node = self.root
        for c in word:
            if c not in node.children:
                node.children[c] = TrieNode()
            node = node.children[c]
        node.leaf = True

    def search(self, word: str) -> str:
        node = self.root
        for i in range(len(word)):
            c = word[i]
            if c not in node.children:
                return word
            node = node.children[c]
            if node.leaf:
                return word[:i+1]
        return word

class TrieNode:
    def __init__(self):
        self.children = {}
        self.leaf = False