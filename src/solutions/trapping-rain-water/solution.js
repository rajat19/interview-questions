/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    let left=0, right=height.length-1, min, level=0, water=0;
    while(left < right) {
        if (height[left] < height[right]) {
            min = height[left++];
        } else {
            min = height[right--];
        }
        if (min > level) level = min;
        water += level - min;
    }
    return water;
};