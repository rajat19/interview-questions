class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int n = matrix.size(), m = matrix[0].size();
        int row = 0, col = m-1;
        while(row < n && col >= 0) {
            int cell = matrix[row][col];
            if (cell == target) return true;
            if (cell < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
};