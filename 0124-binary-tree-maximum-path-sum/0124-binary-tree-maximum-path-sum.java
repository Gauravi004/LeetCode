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
    int sum=0;
    public int maxPathSum(TreeNode root) {
    if(root == null){
        return 0;
    }
        findMax(root);

        return max;
    }

    int findMax(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = Math.max(0, findMax(root.left));
        int right = Math.max(0, findMax(root.right));

        sum = root.val + left+right;

        max = Math.max(max, sum);

        return root.val + Math.max(left, right);
    }
}