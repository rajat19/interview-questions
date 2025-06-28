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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(int i=0; i<lists.length; i++) {
            if (lists[i] != null) pq.offer(lists[i]);
        }
        ListNode head = new ListNode();
        ListNode temp = head;
        while(!pq.isEmpty()) {
            ListNode top = pq.poll();
            if (top.next != null) pq.offer(top.next);
            top.next = null;
            temp.next = top;
            temp = temp.next;
        }
        return head.next;
    }
}