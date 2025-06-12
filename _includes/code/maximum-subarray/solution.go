func maxSubArray(nums []int) int {
    x := nums[0]
    res := 0
    for i := 0; i<len(nums); i++ {
        res = Max(nums[i], res+nums[i])
        x = Max(res, x)
    }
    return x
}

func Max(x, y int) int {
    if x < y {
        return y
    }
    return x
}