class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        lp, ls = len(p), len(s)
        dp = [[False] * (lp+1) for _ in range(ls + 1)]
        dp[-1][-1] = True
        
        for i in range(ls, -1, -1):
            for j in range(lp - 1, -1, -1):
                match = i < ls and p[j] in {s[i], '.'}
                if j + 1 < lp and p[j+1] == '*':
                    dp[i][j] = dp[i][j+2] or match and dp[i+1][j]
                else:
                    dp[i][j] = match and dp[i+1][j+1]
        return dp[0][0]
        