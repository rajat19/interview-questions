class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return dfs(s, wordSet, new HashMap<String, List<String>>());
    }

    private List<String> dfs(String s, Set<String> wordDict, Map<String, List<String>> map) {
        if (map.containsKey(s)) {
            return map.get(s);
        }

        List<String> res = new ArrayList<String>();
        if (s.length() == 0) {
            res.add("");
            return res;
        }
        for (String word : wordDict) {
            int wlen = word.length();
            if (s.length() < wlen) continue;
            boolean match = true;
            for(int i=0; i<wlen; i++) {
                if (s.charAt(i) != word.charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                List<String>sublist = dfs(s.substring(word.length()), wordDict, map);
                for (String sub : sublist)
                    res.add(word + (sub.isEmpty() ? "" : " ") + sub);
            }
        }
        map.put(s, res);
        return res;
    }
}