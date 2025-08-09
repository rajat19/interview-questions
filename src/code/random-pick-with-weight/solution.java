class Solution {
    private int[] prefix;
    private Random random;
    public Solution(int[] w) {
        random = new Random();
        prefix = new int[w.length];
        prefix[0] = w[0];
        for(int i=1; i<w.length; i++) {
            prefix[i] = w[i] + prefix[i-1];
        }
    }

    public int pickIndex() {
        int limit = prefix[prefix.length - 1];
        int digit = random.nextInt(limit) + 1;
        return search(digit);
    }

    private int search(int digit) {
        int left = 0, right = prefix.length - 1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if (prefix[mid] == digit) {
                return mid;
            }
            if (prefix[mid] < digit) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */