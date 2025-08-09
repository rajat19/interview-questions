package find_the_duplicate_number

func findDuplicate(nums []int) int {
	slow := nums[0]
	fast := nums[0]
	for true {
		slow = nums[slow]
		fast = nums[nums[fast]]
		if slow == fast {
			break
		}
	}
	slow = nums[0]
	for slow != fast {
		slow = nums[slow]
		fast = nums[fast]
	}
	return fast
}
