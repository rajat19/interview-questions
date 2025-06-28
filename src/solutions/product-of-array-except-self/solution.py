class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1 for _ in range(len(nums))]
        prev = 1
        for i in range(len(nums)):
            res[i] = prev
            prev *= nums[i]
        prev = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= prev
            prev *= nums[i]
        return res