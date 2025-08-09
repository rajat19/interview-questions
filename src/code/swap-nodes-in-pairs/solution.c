/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* swapPairs(struct ListNode* head){
    if (head == NULL || head->next == NULL) return head;
    struct ListNode *l1 = head, *l2 = head->next;
    l1->next = l2->next;
    l2->next = l1;
    l1->next = swapPairs(l1->next);
    return l2;
}