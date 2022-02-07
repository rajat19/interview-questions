class Solution:
    def longestPalindrome(self, s: str) -> str:
        start, end = 0, 0
        for i in range(0, len(s)):
            len1 = self.expandAroundCenter(s, i, i)
            len2 = self.expandAroundCenter(s, i, i+1)
            mxl = max(len1, len2)
            if mxl > end - start:
                start = i - (mxl-1)//2
                end = i + mxl // 2
        return s[start: end+1]

    def expandAroundCenter(self, s: str, i: int, j: int) -> int:
        left, right = i, j
        while left >=0 and right<len(s) and s[left] == s[right]:
            left -= 1
            right += 1
        return right - left - 1