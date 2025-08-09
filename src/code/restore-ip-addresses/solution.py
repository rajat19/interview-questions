from typing import List


class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        res, n = [], len(s)
        for i in range(0, n - 2):
            for j in range(i + 1, n - 1):
                for k in range(j + 1, n):
                    s1, s2, s3, s4 = s[:i], s[i:j], s[j:k], s[k:]
                    if self.isValid([s1, s2, s3, s4]):
                        res.append(s1 + "." + s2 + "." + s3 + "." + s4)
        return res

    def isValid(self, li):
        valid = True
        for s in li:
            if len(s) == 0 or len(s) > 3 or (s[0] == '0' and len(s) > 1) or int(s) > 255:
                valid = False
                break
        return valid
