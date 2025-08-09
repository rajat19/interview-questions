class Solution {
public:
    vector<int> findBall(vector<vector<int>>& grid) {
        int n = grid.size(), m = grid[0].size();
        vector<int> res;
        for(int j=0; j<m; j++) {
            int startCol = j;
            for(int i=0; i<n; i++) {
                int endCol = startCol + grid[i][startCol];
                if (endCol < 0 || endCol >= m || grid[i][endCol] != grid[i][startCol]) {
                    startCol = -1;
                    break;
                }
                startCol = endCol;
            }
            res.push_back(startCol);
        }
        return res;
    }
};