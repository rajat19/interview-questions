class Solution:
    def maxIncreaseKeepingSkyline(self, grid: List[List[int]]) -> int:
        n = len(grid)
        row, col = [0]*n, [0]*n
        for i in range(n):
            for j in range(n):
                row[i] = max(row[i], grid[i][j])
                col[j] = max(col[j], grid[i][j])

        increase = 0
        for i in range(n):
            for j in range(n):
                newheight = min(row[i], col[j])
                if newheight > grid[i][j]:
                    increase += newheight - grid[i][j]
        return increase