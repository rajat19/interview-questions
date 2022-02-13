package populating_next_right_pointers_in_each_node

type Node struct {
	Val int
	Left *Node
	Right *Node
	Next *Node
}

func connect(root *Node) *Node {
	level := root
	for level != nil {
		curr := level
		for curr != nil {
			if curr.Left != nil {
				curr.Left.Next = curr.Right
			}
			if curr.Right != nil && curr.Next != nil {
				curr.Right.Next = curr.Next.Left
			}
			curr = curr.Next
		}
		level = level.Left
	}
	return root
}