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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        int count = 1;
        que.offer(root);
        while(!que.isEmpty()){
            int length = que.size();
            for(int index = 0; index < length; index++){
                TreeNode node = que.poll();
                if(node.left == null && node.right == null) return count;
                if(node.left != null) que.offer(node.left);
                if(node.right != null) que.offer(node.right);
            }
            count++;
        }
        return count;
    }
}