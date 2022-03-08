class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        stack = []
        arr = list(s)
        print(arr)
        for i in range(len(s)):
            if s[i] == '(':
                stack.append(i)
            elif s[i] == ')':
                if not stack:
                    arr[i] = '*'
                else:
                    stack.pop()
        while stack:
            arr[stack.pop()] = '*'
        return ''.join(arr).replace('*', '')