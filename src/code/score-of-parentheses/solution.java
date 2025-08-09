class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(0);
            } else {
                int curr = stack.pop();
                int prev = stack.pop();
                stack.push(prev + Math.max(2*curr, 1));
            }
        }
        return stack.pop();
    }
}