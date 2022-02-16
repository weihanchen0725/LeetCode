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
    public List<TreeNode> generateTrees(int n) {
        return generate(1, n);
    }
    public List<TreeNode> generate(int start, int end){
        List<TreeNode> trees = new ArrayList<>();
        if(start > end){
            trees.add(null);
            return trees;
        }
        for(int treeValue = start; treeValue <= end; treeValue++){
            List<TreeNode> leftSubTrees = generate(start, treeValue-1);
            List<TreeNode> rightSubTrees = generate(treeValue+1, end);
            for(TreeNode leftTree : leftSubTrees){
                for(TreeNode rightTree : rightSubTrees){
                    TreeNode root = new TreeNode(treeValue);
                    root.left = leftTree;
                    root.right = rightTree;
                    trees.add(root);
                }
            }
        }
        return trees;
    }
}