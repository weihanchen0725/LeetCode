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
    int preorderIndex = 0, inorderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MAX_VALUE);
    }
    public TreeNode build(int[] preorder, int[] inorder, int max){
        if(inorderIndex == inorder.length || inorder[inorderIndex] == max) return null;
        TreeNode node = new TreeNode(preorder[preorderIndex++]);
        node.left = build(preorder, inorder, node.val);
        inorderIndex++;
        node.right = build(preorder, inorder, max);
        return node;
    }
}