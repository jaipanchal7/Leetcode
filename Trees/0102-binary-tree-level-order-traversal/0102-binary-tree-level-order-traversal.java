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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        levelOrderHelper(root, answer, 0);
        return answer;
    }
        
    private void levelOrderHelper(TreeNode node, List<List<Integer>> list, int depth){
        if (node == null) 
        return;

        if (depth == list.size()){
            list.add(new ArrayList<>());
        }

        list.get(depth).add(node.val);
        levelOrderHelper(node.left, list, depth + 1);
        levelOrderHelper(node.right, list, depth + 1);
    }
}