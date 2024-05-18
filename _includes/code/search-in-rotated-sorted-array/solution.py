class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if not nums: return -1
        l = len(nums)
        ll, ul = 0, l-1
        while ll <= ul:
            m = (ll + ul) // 2
            print(ll, m, ul)
            if nums[m] == target:
                return m
            if nums[ll] <= nums[m]:
                if nums[ll] <= target <= nums[m]:
                    ul = m - 1
                else:
                    ll = m + 1
            else:
                if nums[m] <= target <= nums[ul]:
                    ll = m + 1
                else:
                    ul = m - 1
            
        return -1