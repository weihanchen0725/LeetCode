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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        return inorder(root, new ArrayList<>());
    }
    public List<Integer> inorder(TreeNode node, List<Integer> results){
        if(node == null) return results;
        inorder(node.left, results);
        results.add(node.val);
        inorder(node.right, results);
        return results;
    }
}