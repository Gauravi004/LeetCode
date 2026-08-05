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
    public int diameterOfBinaryTree(TreeNode root) {
        int max=Integer.MIN_VALUE;
        if(root==null){
            return 0;
        }

       int lefdia = diameterOfBinaryTree(root.left);
       int rightdia = diameterOfBinaryTree(root.right); 
       int cur_dia = height(root.left) + height(root.right);

    //    max =Math.max(lefdia, rightdia);

       return Math.max(cur_dia, Math.max(lefdia, rightdia));


    }

    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left , right) + 1;
    }
}