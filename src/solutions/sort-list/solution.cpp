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
    ListNode* sortList(ListNode* head) {
        if (head == nullptr || head->next == nullptr) return head;
        ListNode *slow = head, *fast = head;
        while(fast->next != nullptr && fast->next->next != nullptr) {
            slow = slow->next;
            fast = fast->next->next;
        }
        ListNode *next = slow->next;
        slow->next = nullptr;
        ListNode *first = sortList(head);
        ListNode *second = sortList(next);
        return merge(first, second);
    }
    
    ListNode* merge(ListNode* first, ListNode* second) {
        ListNode *prev = new ListNode();
        ListNode *head = prev;
        while(first != nullptr || second != nullptr) {
            if (first == nullptr) {
                prev->next = second;
                second = second->next;
            }
            else if (second == nullptr) {
                prev->next = first;
                first = first->next;
            } else {
                if (first->val < second->val) {
                    prev->next = first;
                    first = first->next;
                } else {
                    prev->next = second;
                    second = second->next;
                }
            }
            prev = prev->next;
            prev->next = nullptr;
        }
        return head->next;
    }
};