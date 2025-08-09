class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Long.compare(getArea(b), getArea(a)));
        for(int[] point: points) {
            if (pq.size() < k) {
                pq.offer(point);
            } else {
                if (getArea(point) < getArea(pq.peek())) {
                    pq.poll();
                    pq.offer(point);
                }
            }
        }

        int[][] res = new int[k][2];
        while(!pq.isEmpty()) {
            res[--k] = pq.poll();
        }

        return res;
    }

    private long getArea(int[] a) {
        return (a[0]*a[0] + a[1]*a[1]);
    }
}