from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        n, m = len(matrix), len(matrix[0])
        row, col = 0, m - 1
        while row < n and col >= 0:
            cell = matrix[row][col]
            if cell == target:
                return True
            if cell < target:
                row += 1
            else:
                col -= 1
        return False
