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
    public boolean isValidBST(TreeNode root) {
        
        // return true if root has no children
        if(root.right==null && root.left==null)
            return true;
        
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean valid(TreeNode root, long low, long high){
        
	    // base case
        if(low>high)
            return false;
            
		// if we got to the end, bst is valid
        if(root==null)
            return true;
        
		// Check for lower and upper bounds
        if(root.val<=low || root.val>=high)
            return false;
        
		// recursion part
        return valid(root.left, low, root.val) && valid(root.right, root.val, high);
    }
}