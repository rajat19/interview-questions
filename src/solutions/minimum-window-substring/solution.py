class Solution:
    def minWindow(self, s: str, t: str) -> str:
        tmap, smap = [0]*256, [0]*256
        requiredChars, foundChars = 0, 0
        left, right, minlength, start, end = 0, 0, -1, 0, 0
        for c in t:
            if tmap[ord(c)] == 0:
                requiredChars += 1
            tmap[ord(c)]+=1
        while right < len(s):
            c = ord(s[right])
            smap[c]+=1
            if tmap[c] > 0 and tmap[c] == smap[c]:
                foundChars += 1
            while left <= right and foundChars == requiredChars:
                c = ord(s[left])
                if minlength == -1 or minlength > right - left + 1:
                    minlength, start, end = right-left+1, left, right
                smap[c]-=1
                if tmap[c] > 0 and tmap[c] > smap[c]:
                    foundChars-=1
                left += 1
            right += 1
        return "" if minlength == -1 else s[start:end+1]