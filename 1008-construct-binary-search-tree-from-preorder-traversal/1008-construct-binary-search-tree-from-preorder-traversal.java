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
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, Integer.MAX_VALUE);
    }
    public TreeNode construct(int[] preorder, int max){
        if(index == preorder.length || preorder[index] > max) return null;
        TreeNode node = new TreeNode(preorder[index++]);
        node.left = construct(preorder, node.val);
        node.right = construct(preorder, max);
        return node;
    }
}