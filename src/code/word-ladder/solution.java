class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) {
            return 0;
        }
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int steps = 0, n = beginWord.length();
        while(!q.isEmpty()) {
            int qs = q.size();
            for(int i=0; i<qs; i++) {
                StringBuilder sb = new StringBuilder(q.poll());
                if (endWord.equals(sb.toString())) {
                    return steps+1;
                }
                for(int j=0; j<n; j++) {
                    char orig = sb.charAt(j);
                    for(char k='a'; k<='z'; k++) {
                        sb.setCharAt(j, k);
                        if (set.contains(sb.toString())) {
                            q.offer(sb.toString());
                            set.remove(sb.toString());
                        }
                    }
                    sb.setCharAt(j, orig);
                }
            }
            steps++;
        }
        return 0;
    }
}