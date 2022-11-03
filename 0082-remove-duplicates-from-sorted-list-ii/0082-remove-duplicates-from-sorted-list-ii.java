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
import java.util.*;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode tempo = new ListNode(0);
        ListNode ans = tempo;
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        ListNode temp = head;

        while (temp != null) {
            if (set.contains(temp.val)){
                dup.add(temp.val);
            }else{
                 set.add(temp.val);
            } 
            temp = temp.next;
        }
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int x : set){
            arr1.add(x);
        }
        // System.out.println(arr1);
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int x : dup){
            arr2.add(x);
        }
        // System.out.println(arr2);
        
        arr1.removeAll(arr2);
        // System.out.println(arr1);

        Integer arr[] = new Integer[arr1.size()];              
        for(int i=0; i<arr1.size(); i++){
          arr[i] = arr1.get(i);
        }    
        // for(int i=arr.length-1; i>=0; i--){
        //   arr[i] = arr1.get(i);
        // }  
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        
        for(int i=0; i<arr.length; i++){
            int t = arr[i];
            ListNode temp2 = new ListNode(t);
            ans.next = temp2;
            ans = ans.next;              
        }
        // System.out.println(Arrays.toString(arr));
        return tempo.next;
    }        
}
