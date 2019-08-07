// https://leetcode.com/problems/n-ary-tree-postorder-traversal

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> order = new ArrayList<>();
        goDeeper(root, order);
        return order;
    }
    
    private void goDeeper(Node node, List order) {
        if(node == null) return;
        if(node.children.size() == 0) order.add(node.val);
        else {
            for(int i = 0; i < node.children.size(); i++) {
                goDeeper(node.children.get(i), order);
            }
            order.add(node.val);
        }
    }
}
