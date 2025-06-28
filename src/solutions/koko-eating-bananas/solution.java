class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int pile: piles) max = Math.max(max, pile);
        int left = 0, right = max;
        while(left <= right) {
            int mid = left + (right-left)/2;
            int count = 0;
            for(int pile: piles) {
                count += Math.ceil(1.0*pile/mid);
            }
            if (count > h) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }
}