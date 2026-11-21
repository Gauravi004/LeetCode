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
    public List<Integer>view(TreeNode root, List<Integer> ans, int level){
        if(root ==null){
            return ans;
        }

        if(level==ans.size()){
            ans.add(root.val);
        }

        view(root.right, ans, level+1);
        view(root.left, ans, level +1);

        return ans;
    }
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> finalans = new ArrayList<Integer>();
        
       finalans =  view(root,finalans, 0);
       return finalans;
    }
}