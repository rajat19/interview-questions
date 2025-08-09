class Solution:
    def longestPalindrome(self, s: str) -> str:
        best, start, end = 0, 0, 0
        for i in range(len(s)):
            left = i-1
            while i < len(s) - 1 and s[i] == s[i+1]:
                i += 1
            
            right = i+1
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            
            if right - left > best:
                best, start, end = right-left, left+1, right
        return s[start:end]