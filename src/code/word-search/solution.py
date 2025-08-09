from typing import List


class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        for i in range(len(board)):
            for j in range(len(board[0])):
                if self.check(board, word, i, j, 0):
                    return True
        return False

    def check(self, board: List[List[str]], word: str, r: int, c: int, pos: int):
        if pos == len(word):
            return True
        if r < 0 or r == len(board) or c < 0 or c == len(board[0]):
            return False
        if board[r][c] != word[pos]:
            return False
        board[r][c], orig = '0', board[r][c]
        res = self.check(board, word, r + 1, c, pos + 1) or self.check(board, word, r - 1, c, pos + 1) or self.check(
            board, word, r, c + 1, pos + 1) or self.check(board, word, r, c - 1, pos + 1)
        board[r][c] = orig
        return res
