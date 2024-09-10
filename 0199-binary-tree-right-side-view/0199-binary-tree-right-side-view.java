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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        TreeNode prevEle = null;
        while(!q.isEmpty()){
            TreeNode remove = q.remove();
            if(remove!=null){
                prevEle = remove;
                if(remove.left!=null){
                    q.add(remove.left);
                }
                if(remove.right!=null){
                    q.add(remove.right);
                }
            }
            else{
                    list.add(prevEle.val);
                    if(!q.isEmpty())
                    q.add(remove);
                }
                
            }
        return list;
        }
        
    }
