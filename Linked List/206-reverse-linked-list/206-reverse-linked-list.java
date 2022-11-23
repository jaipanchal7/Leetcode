/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next==null){
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode forward = null;
        
        while(curr!=null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;            
        }
        head = prev;
        return head;               
    }

    // Using recursion
//     public ListNode reverseList(ListNode head) {
//         if(head == null){
//             return head;
//         }
//         return reverseListNodes(null, head);
//     }
    
//     public ListNode reverseListNodes(ListNode prev, ListNode curr){
//         if(curr == null)
//             return prev;
//         ListNode forward = curr.next;
//         curr.next = prev;
//         return reverseListNodes(curr, forward);
//     }
}