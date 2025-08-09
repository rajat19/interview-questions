/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* prev = new ListNode(0, head);
        ListNode* curr = prev;
        while(head != nullptr) {
            if (head->next != nullptr && head->val == head->next->val) {
                while(head->next != nullptr && head->val == head->next->val) {
                    head = head->next;
                }
                curr->next = head->next;
            } else {
                curr = curr->next;
            }
            head = head->next;
        }
        return prev->next;
    }
};