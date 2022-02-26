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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if(root == null) return results;
        preorder(root, results);
        return results;
    }
    public void preorder(TreeNode node, List<Integer> results){
        if(node == null) return ;
        results.add(node.val);
        preorder(node.left, results);
        preorder(node.right, results);
    }
}