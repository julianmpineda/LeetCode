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
        ListNode current = head, second = head;
    
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }

        while(current.next != null && second.next != null && second.next.next != null) {
            current = current.next;
            second = second.next.next;
   
            if (checkNode == current.next) {
                return true;
            }
        }

        return false;
    }
}
