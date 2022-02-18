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
    public int min = Integer.MAX_VALUE, prev = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        findMin(root);
        return min;
    }
    public void findMin(TreeNode node){
        if(node == null) return ;
        findMin(node.left);
        min = Math.min(min, Math.abs(node.val-prev));
        prev = node.val;
        findMin(node.right);
    } 
}