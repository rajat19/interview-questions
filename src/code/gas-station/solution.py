class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        total, current, start = 0, 0, 0
        for i in range(len(gas)):
            total += gas[i] - cost[i]
            current += gas[i] - cost[i]
            if current < 0:
                current, start = 0, i+1
        return start if total >= 0 else -1