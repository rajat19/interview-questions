/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode next = slow.next;
        slow.next = null;
        ListNode first = sortList(head);
        ListNode second = sortList(next);
        return merge(first, second);
    }

    private ListNode merge(ListNode first, ListNode second) {
        ListNode prev = new ListNode();
        ListNode head = prev;
        while(first != null || second != null) {
            if (first == null) {
                prev.next = second;
                second = second.next;
            }
            else if (second == null) {
                prev.next = first;
                first = first.next;
            } else {
                if (first.val < second.val) {
                    prev.next = first;
                    first = first.next;
                } else {
                    prev.next = second;
                    second = second.next;
                }
            }
            prev = prev.next;
            prev.next = null;
        }
        return head.next;
    }
}