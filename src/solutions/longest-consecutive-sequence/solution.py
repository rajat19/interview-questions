from typing import List


class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        st = set(nums)
        longest = 0
        for num in st:
            if num-1 not in st:
                currentStreak = 1
                currentNum = num
                while (currentNum+1) in st:
                    currentNum += 1
                    currentStreak += 1
                longest = max(longest, currentStreak)
        return longest