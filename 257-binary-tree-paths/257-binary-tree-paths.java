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
    public List<String> results = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return results;
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return results;
    }
    public void dfs(TreeNode node, StringBuilder sb){
        if(node == null) return ;
        int length = sb.length();
        sb.append(node.val);
        if(node.left == null && node.right == null) results.add(sb.toString());
        else{
            sb.append("->");
            dfs(node.left, sb);
            dfs(node.right, sb);
        }
        sb.setLength(length);
    }
}