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
        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
 if(root==null){
            return ans;
        }
        int flag = 0;

        while(!q.isEmpty()){
            List<Integer> temp  = new ArrayList<>();
            int size  = q.size();

            for(int i=0; i<size; i++){
                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }

                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
    temp.add(q.poll().val);
            }
        
          
        if(flag==1){
            Collections.reverse(temp);
            ans.add(temp);
            flag=0;
        }
        else{
            ans.add(temp);
            flag=1;
        }
        }
        return ans;
        
    }
}