class Solution:
    def calculate(self, s: str) -> int:
        res, num, sign = 0, 0, 1
        stack = [sign]
        for c in s:
            if '0' <= c <= '9':
                num = num * 10 + (ord(c) - ord('0'))
            elif c in ['+', '-']:
                res += sign * num
                sign = stack[-1] * (-1 if c == '-' else 1)
                num = 0
            elif c == '(':
                stack.append(sign)
            elif c == ')':
                stack.pop()
        res += sign * num
        return res
