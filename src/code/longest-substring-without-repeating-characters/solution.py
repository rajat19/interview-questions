class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        mp, start, mxl = {}, 0, 0
        for i in range(len(s)):
            if s[i] in mp:
                start = max(start, mp[s[i]] + 1)
            mxl = max(mxl, i - start + 1)
            mp[s[i]] = i
        return mxl