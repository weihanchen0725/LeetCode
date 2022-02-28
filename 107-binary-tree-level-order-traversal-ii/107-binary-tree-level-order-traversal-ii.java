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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        helper(root, results, 0);
        return results;
    }
    public void helper(TreeNode node, List<List<Integer>> results, int level){
        if(node == null) return ;
        if(results.size() <= level) results.add(0, new ArrayList<Integer>());
        helper(node.left, results, level+1);
        helper(node.right, results, level+1);
        results.get(results.size()-level-1).add(node.val);   
    }
}