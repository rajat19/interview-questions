class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        stack = [0]
        for c in s:
            if c == '(':
                stack.append(0)
            else:
                curr, prev = stack.pop(), stack.pop()
                stack.append(prev + max(1, 2*curr))
        return stack.pop()
