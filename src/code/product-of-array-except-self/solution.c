int* productExceptSelf(int* nums, int numsSize, int* returnSize) {
    int countZero = 0, indexZero = -1;
    int product = 1;
    *returnSize = numsSize;

    int* result = (int*) malloc(numsSize * sizeof(int));
    if (!result) return NULL;  // handle malloc failure

    // First pass: count zeros and compute product
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] == 0) {
            countZero++;
            indexZero = i;
        } else {
            product *= nums[i];
        }
    }

    if (countZero > 1) {
        for (int i = 0; i < numsSize; i++) {
            result[i] = 0;
        }
    } else if (countZero == 1) {
        for (int i = 0; i < numsSize; i++) {
            result[i] = (i == indexZero) ? product : 0;
        }
    } else {
        for (int i = 0; i < numsSize; i++) {
            result[i] = product / nums[i];
        }
    }

    return result;
}
