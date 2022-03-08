class Solution:
    def longestPalindrome(self, s: str) -> str:
        n, start, end = len(s), 0, 0
        dp = [[0 for _ in range(n)] for _ in range(n)]
        for i in range(n-1, -1, -1):
            for j in range(i, n):
                if s[i] == s[j] and (j-i <= 2 or dp[i+1][j-1]):
                    dp[i][j] = True
                if dp[i][j] and j-i > end-start:
                    start, end = i, j
        return s[start:end+1]