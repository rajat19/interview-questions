int trap(int* height, int n){
    int left = 0, right = n-1;
    int maxleft = 0, maxright = 0, total = 0;
    while(left < right) {
        if (height[left] < height[right]) {
            if (height[left] < maxleft) {
                total += maxleft - height[left];
            } else {
                maxleft = height[left];
            }
            left++;
        } else {
            if (height[right] < maxright) {
                total += maxright - height[right];
            } else {
                maxright = height[right];
            }
            right--;
        }
    }
    return total;
}