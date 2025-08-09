class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n1, n2 = len(nums1), len(nums2)
        if n1 > n2:
            return self.findMedianSortedArrays(nums2, nums1)
        start, end = 0, n1
        while start <= end:
            m1 = start + (end-start)//2
            m2 = (n1+n2+1)//2 - m1
            x1 = float('-inf') if m1 == 0 else nums1[m1-1]
            x2 = float('-inf') if m2 == 0 else nums2[m2-1]
            y1 = float('inf') if m1 == n1 else nums1[m1]
            y2 = float('inf') if m2 == n2 else nums2[m2]
            if x1 <= y2 and x2 <= y1:
                if (n1+n2)%2 == 0:
                    return (max(x1, x2) + min(y1, y2))/2
                return max(x1, x2)
            elif x1 > y2:
                end = m1 - 1
            else:
                start = m1 + 1
        return -1
