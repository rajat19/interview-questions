class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();
        for(int i=0; i<V; i++) {
            if (!visited.contains(i)) {
                if (dfs(i, adj, visited, -1)) return true;
            }
        }
        return false;
    }

    private boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, Set<Integer> visited, int parent) {
        visited.add(v);
        for(Integer neigh: adj.get(v)) {
            if (!visited.contains(neigh)) {
                if (dfs(neigh, adj, visited, v)) return true;
            } else if (neigh != parent) {
                return true;
            }
        }
        return false;
    }
}