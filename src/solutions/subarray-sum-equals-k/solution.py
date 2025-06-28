class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        mp, sm, count = {}, 0, 0
        mp[0] = 1
        for i in range(0, len(nums)):
            sm += nums[i]
            if sm-k in mp:
                count += mp[sm - k]
            mp[sm] = mp.get(sm, 0) + 1
        return count