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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return checkValid(root, null, null);
    }
    public boolean checkValid(TreeNode node, Integer min, Integer max){
        if(node == null) return true;
        if(min != null && node.val <= min) return false;
        if(max != null && node.val >= max) return false;
        return checkValid(node.left, min, node.val) && checkValid(node.right, node.val, max);
    }
}