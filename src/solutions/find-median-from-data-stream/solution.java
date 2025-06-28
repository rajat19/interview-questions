class MedianFinder {
    PriorityQueue<Integer> first;
    PriorityQueue<Integer> second;
    public MedianFinder() {
        first = new PriorityQueue<>((a,b) -> b-a);
        second = new PriorityQueue<>();
    }

    public void addNum(int num) {
        first.offer(num);
        second.offer(first.poll());
        if (second.size() > first.size()) first.offer(second.poll());
    }

    public double findMedian() {
        if (first.size() > second.size()) return first.peek();
        return (first.peek() + second.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */