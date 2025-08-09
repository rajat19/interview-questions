int singleNumber(int* nums, int size) {
    int ones = 0, twos = 0;
    for(int i=0; i<size; i++) {
        ones = (ones ^ nums[i]) & ~twos;
        twos = (twos ^ nums[i]) & ~ones;
    }
    return ones;
}