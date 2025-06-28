class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Task> map = new HashMap<>();
        for(char c: tasks) {
            map.putIfAbsent(c, new Task(0));
            map.get(c).freq++;
        }

        PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        Queue<Task> cooling = new LinkedList<>();
        pq.addAll(map.values());
        int timer = 0;
        while(!pq.isEmpty() || !cooling.isEmpty()) {
            if (pq.isEmpty()) timer = cooling.peek().lastUsed + n + 1;
            while(!cooling.isEmpty() && cooling.peek().lastUsed + n < timer) {
                pq.offer(cooling.poll());
            }
            Task task = pq.poll();
            task.lastUsed = timer++;
            task.freq--;

            if (task.freq > 0) cooling.offer(task);
        }
        return timer;
    }
}

class Task {
    int freq;
    int lastUsed;
    Task(int freq) {
        this.freq = freq;
        lastUsed = -1;
    }
}