bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize, int target){
    int row = 0, col = *matrixColSize-1;
    while(row < matrixSize && col >= 0) {
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