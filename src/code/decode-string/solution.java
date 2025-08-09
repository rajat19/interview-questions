class Solution {
    public String decodeString(String s) {
        Queue<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) queue.offer(c);
        return helper(queue);
    }

    public String helper(Queue<Character> queue) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while (!queue.isEmpty()) {
            char c= queue.poll();
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                String sub = helper(queue);
                for (int i = 0; i < num; i++) sb.append(sub);
                num = 0;
            } else if (c == ']') {
                break;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}