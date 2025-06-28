class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1]-b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->b-a);
        int time = 0;
        for(int[] c: courses) {
            if (time + c[0] <= c[1]) {
                time += c[0];
                pq.offer(c[0]);
            } else if (!pq.isEmpty() && pq.peek() > c[0]){
                time += c[0] - pq.poll();
                pq.offer(c[0]);
            }
        }
        return pq.size();
    }
}