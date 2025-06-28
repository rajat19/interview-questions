/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseBetween(struct ListNode* head, int left, int right){
    if (head == NULL) return head;
    struct ListNode *prev = NULL, *curr = head;
    while(left > 1) {
        prev = curr;
        curr = curr->next;
        left--;
        right--;
    }

    struct ListNode* tail = curr, *conn = prev;
    while (right > 0) {
        struct ListNode *third = curr->next;
        curr->next = prev;
        prev = curr;
        curr = third;
        right--;
    }

    if (conn != NULL) {
        conn->next = prev;
    } else {
        head = prev;
    }
    tail->next = curr;
    return head;
}