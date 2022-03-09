class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieNode root = new TrieNode();
        for(String product: products) {
            root.add(product);
        }
        int n = searchWord.length();
        List<List<String>> res = new ArrayList<>();
        for(int i=0; i<n; i++) {
            char c = searchWord.charAt(i);
            int pos = c - 'a';
            List<String> list = new ArrayList<>();
            if (root != null && root.children[pos] != null) {
                PriorityQueue<String> pq = root.children[pos].top;
                while(!pq.isEmpty()) list.add(0, pq.poll());
                pq.addAll(list);
            }
            res.add(list);
            if (root == null) continue;
            root = root.children[pos];
        }
        return res;
    }
}

class TrieNode {
    PriorityQueue<String> top;
    TrieNode[] children;
    boolean isEndWord;
    static int MAX_SIZE = 3;
    TrieNode() {
        top = new PriorityQueue<>((a,b) -> b.compareTo(a));
        children = new TrieNode[26];
        isEndWord = false;
    }

    public void add(String s) {
        TrieNode root = this;
        int n = s.length();
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            int pos = c - 'a';
            if (root.children[pos] == null) {
                root.children[pos] = new TrieNode();
            }
            PriorityQueue<String> pq = root.children[pos].top;
            if (pq.size() < MAX_SIZE) pq.offer(s);
            else {
                if (pq.peek().compareTo(s) > 0) {
                    pq.poll();
                    pq.offer(s);
                }
            }
            root.children[pos].top = pq;
            root = root.children[pos];
        }
        root.isEndWord = true;
    }
}