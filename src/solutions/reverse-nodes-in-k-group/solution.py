from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head:
            return head
        count, end = 0, head
        while count < k:
            if end is None:
                return head
            end = end.next
            count += 1
        curr, prev = head, self.reverseKGroup(end, k)
        while curr != end:
            next = curr.next
            curr.next = prev
            prev, curr = curr, next
        return prev