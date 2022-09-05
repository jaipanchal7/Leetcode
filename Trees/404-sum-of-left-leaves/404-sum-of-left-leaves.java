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
    int count=0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        leafNode(root);
        return count;           
    }
    
    public void leafNode(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null && root.left.left==null && root.left.right==null){
            count = count + root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
    }
}