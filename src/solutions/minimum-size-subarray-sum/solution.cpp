class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int start = 0, current = 0, end = 0, minlen = INT_MAX;
        while(end < nums.size()) {
            current += nums[end];
            while(current >= target) {
                minlen = min(minlen, end-start+1);
                current -= nums[start++];
            }
            end++;
        }
        return minlen == INT_MAX ? 0: minlen;
    }
};