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
    int max = Integer.MIN_VALUE;
    int count = 1;
    Integer prev = null;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        int[] results = new int[list.size()];
        for(int index = 0; index < results.length; index++){
            results[index] = list.get(index);
        }
        return results;
    }
    public void helper(TreeNode node, List<Integer> list){
        if(node == null) return ;
        helper(node.left, list);
        if(prev != null){
            if(prev == node.val) count++;
            else count = 1;
        }
        if(count > max){
            max = count;
            list.clear();
            list.add(node.val);
        }else if(count == max){
            list.add(node.val);
        }
        prev = node.val;
        helper(node.right, list);
    }
}