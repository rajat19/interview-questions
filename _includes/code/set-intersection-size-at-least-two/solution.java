class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        int largest = -1, second = -1, n = intervals.length, res = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        for(int i=0; i<n; i++) {
            int start = intervals[i][0], end = intervals[i][1];
            if(start > largest) {
                res += 2;
                second = end - 1;
                largest = end;
            } else if (start > second) {
                res++;
                second = largest == end ? largest - 1 : largest;
                largest = end;
            }
        }
        return res;
    }
}