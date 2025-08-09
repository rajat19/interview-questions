/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* rotateRight(struct ListNode* head, int k){
    if (k==0 || head == NULL || head->next == NULL) return head;
    struct ListNode* fast = head;
    int n=0;
    while(fast != NULL) {
        fast = fast->next;
        n++;
    }
    if (n <= k) k = k%n;
    if (k==0) return head;
    fast = head;
    while(k>0) {
        k--;
        fast = fast->next;
    }
    struct ListNode* slow = head;
    while (fast->next != NULL) {
        slow = slow->next;
        fast = fast->next;
    }
    fast->next = head;
    struct ListNode* newhead = slow->next;
    slow->next = NULL;
    return newhead;
}