class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[] histogram = new int[cols];
        for(int i=0; i<cols; i++) {
            histogram[i] = matrix[0][i] - '0';
        }
        int maxArea = largestRectangleArea(histogram);
        for(int i=1; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                histogram[j] = matrix[i][j] == '1' ? histogram[j]+1 : 0;
            }
            int result = largestRectangleArea(histogram);
            maxArea = Math.max(maxArea, result);
        }
        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        int i=0;
        while(i<n) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, heights[top]*width);
            }
        }
        while(!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, heights[top]*width);
        }
        return maxArea;
    }
}