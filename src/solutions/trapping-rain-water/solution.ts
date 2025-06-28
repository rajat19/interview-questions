function trap(height: number[]): number {
    let maxLeft = 0;
    let maxRight = 0;
    let left = 0;
    let right = height.length - 1;
    let total = 0;
    while(left < right) {
        if (height[left] < height[right]) {
            if (height[left] < maxLeft) {
                total += maxLeft - height[left];
            } else {
                maxLeft = height[left];
            }
            left++;
        } else {
            if (height[right] < maxRight) {
                total += maxRight - height[right];
            } else {
                maxRight = height[right];
            }
            right--;
        }
    }
    return total;
};