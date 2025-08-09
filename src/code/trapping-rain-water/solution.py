from typing import List


class Solution:
    def trap(self, height: List[int]) -> int:
        left, right = 0, len(height) - 1
        maxleft, maxright, total = 0, 0, 0
        while left < right:
            if height[left] < height[right]:
                if height[left] < maxleft:
                    total += maxleft - height[left]
                else:
                    maxleft = height[left]

                left += 1
            else:
                if height[right] < maxright:
                    total += maxright - height[right]
                else:
                    maxright = height[right]

                right -= 1

        return total
