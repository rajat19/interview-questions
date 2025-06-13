class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        def signature(str):
            count = [0]*26
            for c in str:
                count[ord(c) - ord('a')]+= 1
            sign = []
            for i in range(26):
                c = (chr)(i + ord('a'))
                if count[i] != 0:
                    sign.append(f"${c}${count[i]}")
            return ''.join(sign)

        groups = dict()
        for string in strs:
            sign = signature(string)
            if sign in groups:
                groups[sign].append(string)
            else:
                groups[sign] = [string]
        print(groups)
        res = []
        for value in groups.values():
            res.append(value)
        return res