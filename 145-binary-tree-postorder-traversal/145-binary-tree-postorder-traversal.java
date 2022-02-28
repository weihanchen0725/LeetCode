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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if(root == null) return results;
        postorder(root, results);
        return results;
    }
    public void postorder(TreeNode node, List<Integer> results){
        if(node == null) return ;
        postorder(node.left, results);
        postorder(node.right, results);
        results.add(node.val);
    }
}