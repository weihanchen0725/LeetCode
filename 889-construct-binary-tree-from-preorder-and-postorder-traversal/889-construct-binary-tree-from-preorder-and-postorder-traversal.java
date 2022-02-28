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
    int preorderIndex = 0, postorderIndex = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode node = new TreeNode(preorder[preorderIndex++]);
        if(node.val != postorder[postorderIndex]) node.left = constructFromPrePost(preorder, postorder);
        if(node.val != postorder[postorderIndex]) node.right = constructFromPrePost(preorder, postorder);
        postorderIndex++;
        return node;
    }
}