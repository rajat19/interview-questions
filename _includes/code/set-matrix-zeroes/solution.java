class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean rz = false, cz = false;
        for(int i=0; i<n; i++) {
            if (matrix[i][0] == 0) {
                cz = true;
                break;
            }
        }
        for(int i=0; i<m; i++) {
            if (matrix[0][i] == 0) {
                rz = true;
                break;
            }
        }
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=0; i<n; i++) {
            if (cz) matrix[i][0] = 0;
        }
        for(int j=0; j<m; j++) {
            if (rz) matrix[0][j] = 0;
        }
    }
}