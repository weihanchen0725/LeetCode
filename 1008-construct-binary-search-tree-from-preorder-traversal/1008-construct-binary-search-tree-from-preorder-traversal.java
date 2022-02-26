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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int i = 0; i < preorder.length; i++) {
            root = insert(root, preorder[i]);
        }
        return root;
    }
    
    public static TreeNode insert(TreeNode node, int data) {
        if(node == null) {
            return new TreeNode(data);
        }

        if(node.val < data)
            node.right = insert(node.right, data);

        if(node.val > data)
            node.left = insert(node.left, data);

        return node;
    }
}