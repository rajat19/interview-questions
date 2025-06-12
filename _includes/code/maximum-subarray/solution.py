class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 1: return nums[0]
        msf = nums[0]
        mx = 0
        for i in range(len(nums)):
            mx += nums[i]
            if mx > msf:
                msf = mx
            if mx < 0:
                mx = 0
        return msf