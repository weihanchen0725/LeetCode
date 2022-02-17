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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        invert(root);
        return root;
    }
    public void invert(TreeNode  node){
        if(node == null) return ;
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
        invert(node.left);
        invert(node.right);
    }
}