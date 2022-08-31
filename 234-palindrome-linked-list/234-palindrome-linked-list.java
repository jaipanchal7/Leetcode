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
    public boolean isPalindrome(ListNode head) {
        
        if (head == null || head.next == null) {
            return true;
        }
        
        ListNode mid = findmid(head);
        
        ListNode hf = reverse(mid);
        
        return compare(head,hf);
        
    }   
    
     public boolean compare(ListNode head, ListNode hf){
        
        ListNode current = head;
        
        while(hf!=null){
            if(hf.val!=current.val){
                return false;
            }
            hf = hf.next;
            current = current.next;
        }
        return true;     
    }

    
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode forw = null;
        ListNode prev = null;
        
        while(curr!=null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;            
        }
        head = prev;
        return head;  
    }
    
    
    public ListNode findmid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }
            slow=slow.next;
        }
        return slow;
    }
}