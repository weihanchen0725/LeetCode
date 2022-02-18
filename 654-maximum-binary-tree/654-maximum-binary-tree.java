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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Deque<TreeNode> stack = new LinkedList<>();
        for(int index = 0; index < nums.length; index++){
            TreeNode current = new TreeNode(nums[index]);
            while(!stack.isEmpty() && stack.peek().val < nums[index])
                current.left = stack.pop();
            if(!stack.isEmpty()) stack.peek().right = current;
            stack.push(current);
        }
        return stack.isEmpty() ? null : stack.removeLast();
    }
}