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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if(root == null) return results;
        zigzag(root, results, 0);
        return results;
    }
    public void zigzag(TreeNode root, List<List<Integer>> results, int level){
        if(root == null) return ;
        if(results.size() <= level) results.add(new ArrayList<>());
        List<Integer> temp = results.get(level);
        if(level % 2 == 0) temp.add(root.val);
        else temp.add(0, root.val);
        zigzag(root.left, results, level+1);
        zigzag(root.right, results, level+1);
    }
}