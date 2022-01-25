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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root == null) return results;
        que.offer(root);
        while(!que.isEmpty()){
            List<Integer> current = new ArrayList<>();
            int length = que.size();
            for(int index = 0; index < length; index++){
                TreeNode currentNode = que.poll();
                current.add(currentNode.val);
                if(currentNode.left!=null) que.add(currentNode.left);
                if(currentNode.right!=null) que.add(currentNode.right);
            }
            results.add(current);
        }
        return results;
    }
}