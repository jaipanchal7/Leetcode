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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
      ListNode mergedList = new ListNode();
        
        if(list1 == null) 
            return list2;
        if(list2 == null) 
            return list1;
        
        ListNode currNode = new ListNode();
        
        if (list1.val<=list2.val){
            mergedList = list1;
            currNode = list1;
            list1 = list1.next;
        }
        else{
            mergedList = list2;
            currNode = list2;
            list2 = list2.next;
        }
        while (list1!=null && list2!=null){
            if(list1.val<=list2.val){
                currNode.next = list1;
                list1 = list1.next;
                currNode = currNode.next;
            }
            else{
                currNode.next = list2;
                list2 = list2.next;
                currNode = currNode.next;
            }
        }
        
        if (list1==null) 
            currNode.next = list2;
        else 
            currNode.next = list1;
        
        return mergedList;
    }
}