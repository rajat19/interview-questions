class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> List[str]:
        size = len(s)
        memo = [None for _ in range(size + 1)]

        def dfs(start):
            if start > size - 1:
                return [[]]
            if memo[start]:
                return memo[start]
            res = []
            for i in range(start, size):
                word = s[start: i + 1]
                if word in wordDict:
                    rest_res = dfs(i + 1)
                    for item in rest_res:
                        res.append([word] + item)
            memo[start] = res
            return res
        res = dfs(0)
        ans = []
        for item in res:
            ans.append(" ".join(item))
        return ans