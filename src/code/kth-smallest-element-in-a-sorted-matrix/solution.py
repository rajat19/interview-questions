class Solution:
    def kthSmallest(self, matrix, k):
        m, n = len(matrix), len(matrix[0])

        def countLessOrEqual(x):
            cnt = 0
            c = n - 1
            for r in range(m):
                while c >= 0 and matrix[r][c] > x:
                    c -= 1
                cnt += (c + 1)
            return cnt

        left, right = matrix[0][0], matrix[-1][-1]
        ans = -1
        while left <= right:
            mid = (left + right) // 2
            if countLessOrEqual(mid) >= k:
                ans = mid
                right = mid - 1
            else:
                left = mid + 1

        return ans