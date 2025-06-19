class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, current = 0, start = 0;
        for(int index = 0; index < gas.length; index++) {
            total += gas[index] - cost[index];
            current += gas[index] - cost[index];
            if (current < 0) {
                current = 0;
                start = index+1;
            }
        }
        if (total < 0) {
            return -1;
        }
        return start;
    }
}