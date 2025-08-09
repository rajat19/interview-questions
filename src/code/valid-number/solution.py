class Solution:
    def isNumber(self, s: str) -> bool:
        num, exp, dec, sign = [False]*4
        for c in s:
            if '0' <= c <= '9':
                num = True
            elif c == 'e' or c == 'E':
                if not num or exp:
                    return False
                exp = True
                sign = False
                dec = False
                num = False
            elif c == '.':
                if exp or dec:
                    return False
                dec = True
            elif c == '+' or c == '-':
                if sign or num or dec:
                    return False
                sign = True
            else:
                return False
        return num