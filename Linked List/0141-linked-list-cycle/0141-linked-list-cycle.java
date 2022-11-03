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
        // Time - O(n), Space - O(1)
        if(head==null || head.next==null){
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
            }
            slow = slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
        
        // Time - O(n), Space - O(n)
        // HashSet<ListNode> set = new HashSet<>();
        // while(head!=null)
        // {
        //     if(set.contains(head))
        //         return true;
        //     set.add(head);
        //     head = head.next;
        // }
        // return false;
    }
}