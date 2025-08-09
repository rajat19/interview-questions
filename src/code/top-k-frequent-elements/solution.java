class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue((a, b) -> count.getOrDefault(b,0) - count.getOrDefault(a, 0));
        for(int n: nums) {
            if (!count.containsKey(n)) {
                pq.offer(n);
            }
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        int[] result = new int[k];
        int i = 0;
        while(!pq.isEmpty() && i<k) {
            result[i++] = pq.poll();
        }
        return result;
    }
}