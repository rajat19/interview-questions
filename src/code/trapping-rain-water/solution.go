package trapping_rain_water

func trap(height []int) int {
	n := len(height)
	left, right := 0, n-1
	maxLeft, maxRight, total := 0, 0, 0
	for left < right {
		if height[left] < height[right] {
			if height[left] >= maxLeft {
				maxLeft = height[left]
			} else {
				total += maxLeft - height[left]
			}
			left++
		} else {
			if height[right] >= maxRight {
				maxRight = height[right]
			} else {
				total += maxRight - height[right]
			}
			right--
		}
	}
	return total
}
