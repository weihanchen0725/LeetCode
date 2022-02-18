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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder, inorder.length-1, 0, postorder.length-1);
    }
    public TreeNode build(int[] inorder, int[] postorder, int iStart, int iEnd, int pStart){
        if(pStart < 0 || iStart < iEnd) return null;
        TreeNode node = new TreeNode(postorder[pStart]);
        int index = 0;
        for(int i = iStart; i >= iEnd; i--){
            if(node.val == inorder[i]){
                index = i;
                break;
            }
        }
        node.right = build(inorder, postorder, iStart, index+1, pStart-1);
        node.left = build(inorder, postorder, index-1, iEnd, pStart-(iStart-index)-1);
        return node;
    }
}