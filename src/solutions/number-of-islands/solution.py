class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def graph_search(grid: List[List[str]], i: int, j: int, m: int, n: int):
            if 0 <= i < m and 0 <= j < n and grid[i][j] == '1':
                grid[i][j] = '0'
                graph_search(grid, i+1, j, m, n)
                graph_search(grid, i-1, j, m, n)
                graph_search(grid, i, j+1, m, n)
                graph_search(grid, i, j-1, m, n)
        m: int = len(grid)
        n: int = len(grid[0])
        count = 0
        for i in range(m):
            for j in range(n):
                if grid[i][j] == '1':
                    count += 1
                    graph_search(grid, i, j, m, n)
        return count
