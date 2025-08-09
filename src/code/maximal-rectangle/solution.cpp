class Solution {
public:
    int maximalRectangle(vector<vector<char>>& matrix) {
        int rows = matrix.size(), cols = matrix[0].size();
        vector<int> histogram(cols, 0);
        for(int i=0; i<cols; i++) {
            histogram[i] = matrix[0][i] - '0';
        }
        int maxArea = largestHistogram(histogram);
        for(int i=1; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                histogram[j] = matrix[i][j] == '1' ? histogram[j] + 1 : 0;
            }
            maxArea = max(maxArea, largestHistogram(histogram));
        }
        return maxArea;
    }

    int largestHistogram(vector<int> &matrix) {
        stack<int> st;
        int n = matrix.size();
        int maxArea = 0, i = 0;
        while(i<n) {
            if (st.empty() || matrix[st.top()] <= matrix[i]) {
                st.push(i++);
            } else {
                int top = st.top(); st.pop();
                int width = st.empty() ? i : i - st.top() - 1;
                maxArea = max(maxArea, matrix[top]*width);
            }
        }
        while(!st.empty()) {
            int top = st.top(); st.pop();
            int width = st.empty() ? n : n - st.top() - 1;
            maxArea = max(maxArea, matrix[top]*width);
        }
        return maxArea;
    }
};