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
    public ListNode removeNthFromEnd(ListNode head, int n) {
                
        if(head==null || head.next==null){
            return null;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw;
        
        while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        
        ListNode endNode = prev;
        ListNode temp = endNode;
         
        
        int i=1;
        while(temp!=null){
            if(n==1){
                endNode = temp.next;
                break;
            }
            if(i==n-1){
                temp.next = temp.next.next;
            }else
            temp = temp.next;
            i++;
        }
        ListNode prev1 = null;
        ListNode curr1 = endNode;
        ListNode forw1;
        
        while(curr1!=null){
            forw1 = curr1.next;
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = forw1;
        }
        return prev1;  
        
        
        
//         if(head==null || head.next==null) {
//             return null;
//         }
  
//          int size = 0;
//          ListNode temp = head;
//          while(temp != null) {
//              temp = temp.next;
//              size++;
//          }
//          //removing SIZEth node from last
//          if(n == size) {
//              return head.next;
//          }
//          //find previous node
//          int ptf = size - n; // position to find
//          ListNode prev = head; // previous node
//          int cp = 1; // current position
//          while(cp != ptf) {
//              prev = prev.next;
//              cp++;
//          }
//          prev.next = prev.next.next;
//          return head;
        
    }
}