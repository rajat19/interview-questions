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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return head;
        ListNode prev = null, curr = head;
        while(left > 1) {
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }

        ListNode tail = curr, conn = prev;
        while(right > 0) {
            ListNode third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
            right--;
        }

        if (conn != null) {
            conn.next = prev;
        } else {
            head = prev;
        }
        tail.next = curr;
        return head;
    }
}