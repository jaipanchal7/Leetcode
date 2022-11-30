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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(k<=0 || head==null || head.next==null){
            return head;
        }
        
        // calculate length of linked list
        ListNode temp = head;
        int length = 1;
        while(temp.next!=null){
            temp = temp.next;
            length++;
        }
        temp.next = head;
        
        int rotations = k % length;
        int skip = length - rotations;
        System.out.println(length);
        System.out.println(rotations);
        System.out.println(skip);
        
        ListNode newLast = head;
        for(int i=0; i<skip-1; i++){
            newLast = newLast.next;
        }
        
        head = newLast.next;
        newLast.next = null;
        
        return head;
    }
}