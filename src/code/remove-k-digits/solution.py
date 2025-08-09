class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        if k == len(num):
            return '0'
        top = 0
        arr = ['']*len(num)
        for c in num:
            while k>0 and top>0 and arr[top-1] > c:
                top -= 1
                k -= 1
            arr[top] = c
            top += 1
        i = 0
        while i < top-k-1 and arr[i] == '0':
            i += 1
        return ''.join(arr[i:top-k])