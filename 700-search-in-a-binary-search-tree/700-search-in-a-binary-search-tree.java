/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        // TC : O(n), SC : O(1)
        if(root==null){
            return root;
        }
        
        TreeNode temp = root;
        
        while(temp!=null){
            if(temp.val==val){
                return temp;
            }
            if(val<temp.val){
                temp = temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        return temp;
        
        // TC : log(n), SC : O(H)
        // if(root==null){
        //     return null;
        // }
        // if(root.val==val){
        //     return root;
        // }
        // if(val<root.val){
        //     return searchBST(root.left,val);
        // }
        // else{
        //     return searchBST(root.right,val);
        // }
    }
}