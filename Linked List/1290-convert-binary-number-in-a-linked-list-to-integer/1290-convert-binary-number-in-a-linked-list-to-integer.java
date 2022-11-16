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
    public int getDecimalValue(ListNode head) {
        
        int result = head.val;
        while (head.next != null) {
            result = result * 2 + head.next.val;
            head = head.next;
        }
        return result;
        
        // int sum=0;
        // while(head!=null){
        //     sum = sum*2;
        //     sum = sum+head.val;
        //     head = head.next;
        // }
        // return sum;
    }
}