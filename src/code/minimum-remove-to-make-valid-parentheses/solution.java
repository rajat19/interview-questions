class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder builder = new StringBuilder(s);
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.offerLast(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                } else {
                    builder.setCharAt(i, '*');
                }
            }
        }

        while(!stack.isEmpty()) {
            builder.setCharAt(stack.pollLast(), '*');
        }

        return builder.toString().replace("*", "");
    }
}

/*
* Alternate approach without using stack
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        int open = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open > 0) {
                    open--;
                } else {
                    sb.setCharAt(i, '*');
                }
            }
        }

        int i = s.length() - 1;
        while(i >=0 && open > 0) {
            if (s.charAt(i) == '(') {
                sb.setCharAt(i, '*');
                open--;
            }
            i--;
        }

        return sb.toString().replace("*", "");
    }
}
*
* */