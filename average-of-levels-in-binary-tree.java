// https://leetcode.com/problems/average-of-levels-in-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
            double sum = 0, size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                sum += current.val;
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            averages.add(sum*1.0/size);
        }
        
        return averages;
    }
    
}
