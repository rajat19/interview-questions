/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(NULLptr) {}
 *     ListNode(int x) : val(x), next(NULLptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if (k==0 || head == NULL || head->next == NULL) return head;
        ListNode* fast = head;
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
        ListNode* slow = head;
        while (fast->next != NULL) {
            slow = slow->next;
            fast = fast->next;
        }
        fast->next = head;
        ListNode* newhead = slow->next;
        slow->next = NULL;
        return newhead;
    }
};