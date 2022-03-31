package search_a_2d_matrix

func searchMatrix(matrix [][]int, target int) bool {
	n := len(matrix)
	m := len(matrix[0])
	row := 0
	col := m-1
	for row < n && col >=0 {
		cell := matrix[row][col]
		if cell == target {
			return true
		}
		if cell < target {
			row++
		} else {
			col--
		}
	}
	return false
}
