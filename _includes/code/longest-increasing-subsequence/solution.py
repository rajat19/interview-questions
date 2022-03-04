class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        size, lis = 0, [0]*len(nums)
        for num in nums:
            start, end = 0, size
            while start != end:
                mid = start + (end-start)//2
                if lis[mid] < num:
                    start = mid+1
                else:
                    end = mid
            lis[start] = num
            if start == size:
                size += 1
        return size