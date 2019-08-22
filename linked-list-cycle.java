// https://leetcode.com/problems/linked-list-cycle

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;
        ListNode slow = head, fast = head.next;
        if(slow == fast) return true;
        do {
            slow = slow.next;
            fast = fast.next;
            if(slow == fast) return true;
            if(fast == null || fast.next == null) return false;
            else fast = fast.next;
            if(slow == fast) return true;
        } while(fast != null);
        
        return true;
    }
}
