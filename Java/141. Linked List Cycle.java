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
        ListNode current = head;
        int nodeMain = 0;
    
        if (current == null) {
            return false;
        }

        while(current.next != null) {
            ListNode checkNode = head;

            for (int i = 0; i < nodeMain; i++) {
                if (checkNode == current.next) {
                    return true;
                } else {
                    checkNode = checkNode.next;
                }
            }
            current = current.next;
            nodeMain++;
        }

        return false;
    }
}
