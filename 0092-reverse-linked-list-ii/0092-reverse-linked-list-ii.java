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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        // newHead = leftNode
        // newEnd = rightNode
        
        if(left == right){
            return head;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        
        for(int i=1; curr!=null && i<left; i++){
            prev = curr;
            curr = curr.next;
        }
        
        ListNode originalhead = prev;
        ListNode newEnd = curr;
        
        // reverse b/w left and right
        ListNode forward = null;
        for(int i=0; curr!=null && i < right-left+1; i++){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward; 
        }
        
        ListNode prevTail = curr; // last node or rightNode of previous list, curr = rightNode
        ListNode newHead = prev;
        if(originalhead!=null){
            originalhead.next = newHead; // newHead = head of new reverse list
        }else{
            head = newHead;
        }
        
        newEnd.next = prevTail;
        return head;
    }
}