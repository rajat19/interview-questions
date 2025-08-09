/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseKGroup(struct ListNode* head, int k){
    if (head == NULL) return head;
    int count = 0;
    struct ListNode* end = head;
    while(count++ < k) {
        if (end == NULL) return head;
        end = end->next;
    }
    struct ListNode *next, *curr = head, *prev = reverseKGroup(end, k);
    while(curr != end) {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}