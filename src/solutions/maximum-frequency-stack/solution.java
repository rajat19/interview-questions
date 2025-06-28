class FreqStack {

    private PriorityQueue<Node> pq;
    private Map<Integer, Integer> freq;
    private int index;
    public FreqStack() {
        pq = new PriorityQueue<>();
        freq = new HashMap<>();
        index = 0;
    }

    public void push(int val) {
        freq.put(val, freq.getOrDefault(val, 0) + 1);
        pq.offer(new Node(val, freq.get(val), index++));
    }

    public int pop() {
        Node top = pq.poll();
        freq.put(top.val, freq.get(top.val) - 1);
        return top.val;
    }
}

class Node implements Comparable<Node> {
    int val;
    int freq;
    int index;
    Node(int v, int f, int i) {
        val = v;
        freq = f;
        index = i;
    }

    public int compareTo(Node o) {
        if (this.freq != o.freq) return o.freq - this.freq;
        return o.index - this.index;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */