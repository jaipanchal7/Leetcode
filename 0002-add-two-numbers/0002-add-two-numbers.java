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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null) 
            return l2;
        if(l2 == null) 
            return l1;
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        int carry = 0;
        
        while(l1 != null || l2 != null || carry != 0){
            int sum = 0;
            
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            } 
            
            sum += carry;
            carry = sum / 10;
            
            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        
        return dummy.next;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // ListNode add = l1;
//         ListNode tempo = new ListNode(0);
//         ListNode op = tempo;
        
//         ListNode list1 = reverse1(l1);
//         ListNode list2 = reverse2(l2);
        
//         String addlist1 = add1(list1);
//         String addlist2 = add2(list2);
        
//         long i1 = Long.parseLong(addlist1);
//         long i2 = Long.parseLong(addlist2);
//         // Integer.parseInt(addlist1);
//         // int i2 = Integer.parseInt(addlist2);
//         long i3 = i1+i2;
//         System.out.println(i3);
//         String ans = String.valueOf(i3);
//         System.out.println(ans);
        
//         for(int i=ans.length()-1; i>=0; i--){
//             int t = Integer.parseInt(String.valueOf(ans.charAt(i)));
//                 // Character.getNumericValue(ans.charAt(i));
//             ListNode temp2 = new ListNode(t);
//             op.next = temp2;
//             op = op.next;              
        // }
        // for(int i=0; i<ans.length(); i++){
        //     add.val = (int)ans.charAt(i);
        //     add = add.next;
        // }
        // return tempo.next;
        // ArrayList<Integer> arr = new ArrayList<>();
        // int i = 0, reverse=0;
        // while(i3!=0){
        //     int rem = i3%10;
        //     reverse = reverse * 10 + rem;  
        //     arr.add(rem);
        //     rem = rem/10;
        //     // i++;
        // }
        // System.out.println(reverse);
        // System.out.println(arr);
        // return l1;       
    }
    
    // public String add1(ListNode list1){
    //     String sum1 = "";
    //     ListNode temp = list1;
    //     while(temp!=null){
    //         sum1 += temp.val;
    //         temp = temp.next;
    //     }
    //     return sum1;
    // }
    
//     public String add2(ListNode list2){
//         String sum2 = "";
//         ListNode temp = list2;
//         while(temp!=null){
//             sum2 += temp.val;
//             temp = temp.next;
//         }
//         return sum2;
//     }
    
//     public ListNode reverse1(ListNode l1){
//         ListNode curr = l1;
//         ListNode forw = null;
//         ListNode prev = null;
        
//         while(curr!=null){
//             forw = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = forw;
//         }
//         return prev;        
//     }
    
//     public ListNode reverse2(ListNode l2){
//         ListNode curr = l2;
//         ListNode forw = null;
//         ListNode prev = null;
        
//         while(curr!=null){
//             forw = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = forw;
//         }
//         return prev;        
}