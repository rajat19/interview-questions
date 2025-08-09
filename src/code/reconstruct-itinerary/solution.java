class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for(List<String> ticket: tickets) {
            String src = ticket.get(0);
            String dst = ticket.get(1);
            PriorityQueue<String> pq = map.getOrDefault(src, new PriorityQueue<>());
            pq.offer(dst);
            map.put(src, pq);
        }
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        List<String> res = new ArrayList<>();
        while(!stack.isEmpty()) {
            while (map.containsKey(stack.peek()) && !map.get(stack.peek()).isEmpty()) {
                stack.push(map.get(stack.peek()).poll());
            }
            res.add(0, stack.pop());
        }
        return res;
    }
}