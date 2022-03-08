class Task {
    int freq, lastUsed;
    public Task(int f) {
        freq = f;
        lastUsed = -1;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n == 0) return tasks.length;

        Map<Character, Task> map = new HashMap<>();
        for(char c: tasks) {
            map.putIfAbsent(c, new Task(0));
            map.get(c).freq++;
        }

        PriorityQueue<Task> pq = new PriorityQueue<>((x, y) -> y.freq - x.freq);

        // Use a queue to add tasks that were scheduled at the end
        // Which means tasks that are at the top of the cooling are the ones first to go out of cooling and become available for scheduling.
        Queue<Task> cooling = new LinkedList<>();

        pq.addAll(map.values());
        int count = 0;

        while(!pq.isEmpty() || !cooling.isEmpty()) {
            // if no tasks are available to schedule at current time, go idle until the first cooling task becomes available
            if(pq.isEmpty()) count = cooling.peek().lastUsed + n + 1;

            // Add any tasks in cooling that just became available for scheduling
            while(!cooling.isEmpty() && count > cooling.peek().lastUsed + n) {
                pq.add(cooling.poll());
            }

            // Schedule the most frequent occurring task by polling priority queue.
            Task t = pq.poll();
            t.lastUsed = count++;
            t.freq--;

            // Add the task back into cooling if there are more instances of it to schedule.
            if(t.freq != 0) cooling.add(t);
        }

        return count;
    }
}