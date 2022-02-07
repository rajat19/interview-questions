package longest_palindromic_substring

func longestPalindrome(s string) string {
	start, end := 0, 0
	for i := 0; i<len(s); i++ {
		len1 := expandAroundCenter(s, i, i)
		len2 := expandAroundCenter(s, i, i+1)
		mxl := len1
		if len2 > mxl {
			mxl = len2
		}
		if mxl > end - start {
			start = i - (mxl-1)/2
			end = i + (mxl)/2
		}
	}
	return s[start: end+1]
}

func expandAroundCenter(s string, i int, j int) int {
	left, right := i, j
	for left >= 0 && right < len(s) && s[left] == s[right] {
		left--
		right++
	}
	return right - left - 1
}
