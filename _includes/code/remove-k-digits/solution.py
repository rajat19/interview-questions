class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        n = len(num)
        if k == n: return "0"
        stack = []
        for i in range(n):
            while k > 0 and stack and stack[-1] > num[i]:
                stack.pop()
                k-=1
            stack.append(num[i])
        while k > 0:
            stack.pop()
            k-=1
        res = ""
        while stack:
            res = stack.pop() + res
        return str(int(res))
