from typing import List


class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        n = len(nums)
        if n == 0 or k == 0:
            return []
        res, window = [0]*(n-k+1), []
        for i in range(n):
            while window and window[0] <= i-k:
                window.pop(0)
            while window and nums[window[-1]] < nums[i]:
                window.pop()
            window.append(i)
            if i >= k - 1:
                res[i-k+1] = nums[window[0]]
        return res
