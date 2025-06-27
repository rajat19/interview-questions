class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        boolean found = false;

        queue.offer(s);
        visited.add(s);
        while(!queue.isEmpty()) {
            String current = queue.poll();
            if (isValid(current)) {
                result.add(current);
                found = true;
            }

            if (found) {
                continue;
            }

            for(int i=0; i<current.length(); i++) {
                char c = current.charAt(i);
                if (c != '(' && c != ')') {
                    continue;
                }
                String next = current.substring(0, i) + current.substring(i+1);
                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.offer(next);
                }
            }
        }
        return result;
    }

    private boolean isValid(String s) {
        int count = 0;
        for(char c: s.toCharArray()) {
            if (c == '(') {
                count++;
            }
            else if (c == ')'){
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;
    }
}