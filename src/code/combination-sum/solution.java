class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] candidates, int target, int pos, List<Integer> combo, List<List<Integer>> res) {
        if (pos == candidates.length || target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(combo));
            return;
        }
        backtrack(candidates, target, pos+1, combo, res);
        combo.add(candidates[pos]);
        backtrack(candidates, target - candidates[pos], pos, combo, res);
        combo.remove(combo.size() - 1);
    }
}