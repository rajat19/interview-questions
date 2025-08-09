class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        def backtrack(sum: int, pos: int, arr: List[int]):
            if sum <0 or pos >= len(candidates):
                return
            if sum == 0:
                res.append(list(arr))
                return
            backtrack(sum, pos+1, arr)
            arr.append(candidates[pos])
            backtrack(sum-candidates[pos], pos, arr)
            arr.pop()
        backtrack(target, 0, [])
        return res