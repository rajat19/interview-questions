from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        l1, l2 = head, head.next
        l1.next = l2.next
        l2.next = l1
        l1.next = self.swapPairs(l1.next)
        return l2
