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
    public boolean result = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        dfs(root);
        return result;
    }
    public int dfs(TreeNode node){
        if(node == null) return 0;
        int left = 0, right = 0;
        if(node.left != null) left = dfs(node.left);
        if(node.right != null) right = dfs(node.right);
        if(Math.abs(left - right) > 1) result = false;
        return Math.max(left, right) + 1;
    }
}