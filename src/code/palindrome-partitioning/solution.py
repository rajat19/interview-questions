from typing import List


class Solution:
    def partition(self, s: str) -> List[List[str]]:
        n = len(s)
        dp = [[False for _ in range(n)] for _ in range(n)]
        res = []
        self.backtrack(s, 0, dp, [], res)
        return res

    def backtrack(self, s, start, dp, current, res):
        if start >= len(s):
            res.append(list(current))
            return
        for end in range(start, len(s)):
            if s[start] == s[end] and (end-start <= 2 or dp[start+1][end-1]):
                dp[start][end] = True;
                current.append(s[start:end+1])
                self.backtrack(s, end+1, dp, current, res)
                current.pop()