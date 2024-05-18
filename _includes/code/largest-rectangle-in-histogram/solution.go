func largestRectangleArea(heights []int) int {
    i, maxArea, n := 0, 0, len(heights)
    var stack []int
    top := -1
    for i < n {
        if len(stack) == 0 || heights[i] >= heights[stack[len(stack) - 1]] {
            stack = append(stack, i)
            i++
        } else {
            top, stack = stack[len(stack)-1], stack[:len(stack)-1]
            width := i
            if len(stack) > 0 {
                width = i - stack[len(stack)-1] -1
            }
            area := heights[top]*width
            if area > maxArea {
                maxArea = area
            }
        }
    }
    for len(stack) > 0 {
        top, stack = stack[len(stack)-1], stack[:len(stack)-1]
        width := i
        if len(stack) > 0 {
            width = i - stack[len(stack)-1] -1
        }
        area := heights[top]*width
        if area > maxArea {
            maxArea = area
        }
    }
    return maxArea
}