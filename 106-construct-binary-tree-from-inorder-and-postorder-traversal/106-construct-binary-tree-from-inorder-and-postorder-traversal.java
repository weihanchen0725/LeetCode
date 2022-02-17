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
        return traverse(inorder,postorder, inorder.length-1,0,postorder.length-1);
    }
    public TreeNode traverse(int[] inorder, int[] postorder,int inS, int inE,int poS){
        if(poS<0 || inE>inS){
            return null;
        }
        TreeNode node = new TreeNode(postorder[poS]);
        int index = 0;
        for(int i=inS;i>=inE;i--){
            if(node.val == inorder[i])
            {
                index = i;
                break;
            }
        }
        node.right = traverse(inorder,postorder,inS,index+1,poS-1);
        node.left = traverse(inorder,postorder,index-1,inE,poS -(inS-index)-1);
        return node;
    }
}