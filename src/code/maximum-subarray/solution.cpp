class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int s = nums.size();
        if (s == 1) return nums[0];
        int mx = 0;
        int msf = nums[0];
        for(int i=0; i<s; i++) {
            mx += nums[i];
            if (mx > msf) msf = mx;
            if (mx < 0) mx = 0;
        }
        return msf;
    }
};