class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        stack<int> stack;
        int maxArea = 0, n = heights.size(), i=0;
        while(i<n) {
            if (stack.empty() || heights[i] >= heights[stack.top()]) {
                stack.push(i++);
            } else {
                int top = stack.top();
                stack.pop();
                int width = stack.empty() ? i : i - stack.top() - 1;
                maxArea = max(maxArea, width*heights[top]);
            }
        }
        while(!stack.empty()) {
            int top = stack.top();
            stack.pop();
            int width = stack.empty() ? n : n - stack.top() - 1;
            maxArea = max(maxArea, width*heights[top]);
        }
        return maxArea;
    }
};