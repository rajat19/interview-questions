package next_permutation

func nextPermutation(nums []int)  {
	i := len(nums) - 2
	for i>=0 && nums[i+1] <= nums[i] {
		i--
	}
	if i>=0 {
		j := len(nums) - 1
		for nums[j] <= nums[i] {
			j--
		}
		swap(nums, i, j)
	}
	reverse(nums, i+1)
}

func swap(nums [] int, x int, y int) {
	temp := nums[x]
	nums[x] = nums[y]
	nums[y] = temp
}

func reverse(nums []int, start int) {
	left, right := start, len(nums) - 1
	for left < right {
		swap(nums, left, right)
		left++
		right--
	}
}
