class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0]-b[0] : -a[1]+b[1]);
        int n = envelopes.length;
        int[] lis = new int[n];
        int size = 0;
        for(int i=0; i<n; i++) {
            int start = 0, end = size;
            while(start != end) {
                int mid = start + (end-start)/2;
                if (envelopes[i][1] > lis[mid]) {
                    start = mid+1;
                } else {
                    end = mid;
                }
            }
            lis[start] = envelopes[i][1];
            if (start == size) ++size;
        }
        return size;
    }
}