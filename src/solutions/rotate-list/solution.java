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
    public ListNode rotateRight(ListNode head, int k) {
        if (k==0 || head == null || head.next == null) return head;
        ListNode fast = head;
        int n=0;
        while(fast != null) {
            fast = fast.next;
            n++;
        }
        if (n <= k) k = k%n;
        if (k==0) return head;
        fast = head;
        while(k>0) {
            k--;
            fast = fast.next;
        }
        ListNode slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        ListNode newhead = slow.next;
        slow.next = null;
        return newhead;
    }
}