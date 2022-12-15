/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        
        List<Integer> result = new ArrayList<>();
        
        if (root == null){
            return result;
        }
        
        Stack<Node> toVisit = new Stack<>();
        toVisit.push(root);
        
        while (!toVisit.isEmpty()){
            Node visited = toVisit.pop();
            result.add(visited.val);
            Collections.reverse(visited.children);
            for (Node n : visited.children) {
                if (n != null) {
                    toVisit.push(n);
                }
            }
        }
        return result;
    }
}