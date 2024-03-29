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
        for(int rootValue = start; rootValue <= end; rootValue++){
            List<TreeNode> leftSubTrees = generate(start, rootValue-1);
            List<TreeNode> rightSubTrees = generate(rootValue+1, end);
            for(TreeNode leftTrees : leftSubTrees){
                for(TreeNode rightTrees : rightSubTrees){
                    TreeNode node = new TreeNode(rootValue);
                    node.left = leftTrees;
                    node.right = rightTrees;
                    trees.add(node);
                }
            }
        }
        return trees;
    }
}