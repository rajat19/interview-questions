package swap_nodes_in_pairs

type ListNode struct {
	Val int
	Next *ListNode
}

func swapPairs(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	l1 := head
	l2 := head.Next
	l1.Next = l2.Next
	l2.Next = l1
	l1.Next = swapPairs(l1.Next)
	return l2
}
