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
    public int preIndex, inIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return treeBuilder(preorder, inorder, Integer.MAX_VALUE);
    }
    public TreeNode treeBuilder(int[] preorder, int[] inorder, int max){
        if(inIndex == inorder.length || inorder[inIndex] == max) return null;
        TreeNode root = new TreeNode(preorder[preIndex]);
        preIndex++;
        root.left = treeBuilder(preorder, inorder, root.val);
        inIndex++;
        root.right = treeBuilder(preorder, inorder, max);
        return root;
    }
}