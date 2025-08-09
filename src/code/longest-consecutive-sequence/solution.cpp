class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int> numSet;
        for(int n: nums) numSet.insert(n);

        int longest = 0;
        for(int n: numSet) {
            if (!numSet.count(n-1)) {
                int currentStreak = 1;
                int currentNum = n;
                while(numSet.count(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longest = max(longest, currentStreak);
            }
        }
        return longest;
    }
};