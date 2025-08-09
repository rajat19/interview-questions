class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res, new ArrayList<>(), 0);
        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res, List<Integer> subset, int pos) {
        res.add(new ArrayList<>(subset));
        for(int i=pos; i<nums.length; i++) {
            subset.add(nums[i]);
            backtrack(nums, res, subset, i+1);
            subset.remove(subset.size() - 1);
        }
    }
}