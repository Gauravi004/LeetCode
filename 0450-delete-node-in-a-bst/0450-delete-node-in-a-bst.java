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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }

        if(root.val==key){
            return helper(root);
        }

        TreeNode current = root;

        while(current!=null){
            if(key<current.val){
                if(current.left!=null && current.left.val==key){
                    current.left = helper(current.left);
                    break;
                }

                current= current.left;
            }
            else{
                 if(current.right!=null && current.right.val==key){
                    current.right = helper(current.right);
                    break;
                }
                current =  current.right;

            }
        }
        return root;
        
    }

    TreeNode helper(TreeNode root){
        if(root.left==null){
            return root.right;
        }

      else  if(root.right==null){
            return root.left;
        }


        TreeNode rightchild = root.right;
        TreeNode lastRight = findLastRight(root.left);
        lastRight.right = rightchild;

        return root.left; 
    }
     TreeNode findLastRight(TreeNode root){
        if(root.right==null){
            return root;
        }
        return findLastRight(root.right);
     }
}