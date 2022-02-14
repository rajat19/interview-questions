class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        i, n, maxArea = 0, len(heights), 0
        stack = []
        while i<n:
            if not stack or heights[stack[-1]] <= heights[i]:
                stack.append(i)
                i += 1
            else:
                top = stack.pop()
                width = i if not stack else i-stack[-1]-1
                maxArea = max(maxArea, heights[top]*width)
        while stack:
            top = stack.pop()
            width = i if not stack else i-stack[-1]-1
            maxArea = max(maxArea, heights[top]*width)
        return maxArea