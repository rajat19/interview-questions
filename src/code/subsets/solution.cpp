class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> subset = {};
        backtrack(nums, result, subset, 0);
        return result;
    }

    void backtrack(vector<int>& nums, vector<vector<int>>& result, vector<int>& subset, int pos) {
        result.push_back(subset);
        for(int i=pos; i<nums.size(); i++) {
            subset.push_back(nums[i]);
            backtrack(nums, result, subset, i+1);
            subset.pop_back();
        }
    }
};