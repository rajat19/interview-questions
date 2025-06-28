class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> rec = new HashSet<>();
        for(int i=0; i<V; i++) {
            if (dfs(i, adj, visited, rec)) return true;
        }
        return false;
    }

    private boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, Set<Integer> visited, Set<Integer> rec) {
        if (rec.contains(v)) return true;
        if (visited.contains(v)) return false;
        visited.add(v);
        rec.add(v);
        for(Integer neigh: adj.get(v)) {
            if (dfs(neigh, adj, visited, rec)) return true;
        }
        rec.remove(v);
        return false;
    }
}