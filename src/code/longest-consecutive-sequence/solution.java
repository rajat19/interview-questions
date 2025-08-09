class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums) set.add(n);

        int longest = 0;
        for(int n: set) {
            if (!set.contains(n-1)) {
                int currentStreak = 1;
                int currentNum = n;
                while(set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}