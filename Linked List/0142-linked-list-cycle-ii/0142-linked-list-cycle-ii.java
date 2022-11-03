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
    public ListNode detectCycle(ListNode head) {
        // TC : O(n)
        // SC : O(1)
        
        if(head==null || head.next==null){
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        
        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
            }
            slow = slow.next;
            if(slow==fast){
                while(temp!=slow){
                    slow = slow.next;
                    temp = temp.next;
                }
                return slow;
            }
        }
        return null;
    }
}