from typing import List


class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        n, last = len(s), [0]*26
        for i in range(n):
            last[ord(s[i]) - ord('a')] = i
        start, end, res = 0, 0, []
        for i in range(n):
            end = max(end, last[ord(s[i]) - ord('a')])
            if i == end:
                res.append(end - start + 1)
                start = end + 1
        return res