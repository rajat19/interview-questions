class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        int min = Integer.MAX_VALUE, res = Integer.MAX_VALUE;
        for(int a: nums) {
            if (a%2 == 1) a*=2;
            pq.offer(a);
            min = Math.min(min, a);
        }
        while(true) {
            int max = pq.poll();
            res = Math.min(res, max - min);
            if (max%2 == 1) break;
            pq.offer(max/2);
            min = Math.min(min, max/2);
        }
        return res;
    }
}