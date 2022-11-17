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
    public void reorderList(ListNode head) {
        
        ListNode mid =  findmid(head);
        ListNode nextToMid = mid.next;
        
        mid.next = null;
        
        ListNode revNextToMid = reverse(nextToMid);
        
        ListNode temp = head;
        ListNode ans;
        
        while(temp!=null && revNextToMid!=null){
            ans = temp.next;
            temp.next = revNextToMid;
            
            temp = revNextToMid;
            revNextToMid = ans;
        }        
    }
    
    public ListNode findmid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
}