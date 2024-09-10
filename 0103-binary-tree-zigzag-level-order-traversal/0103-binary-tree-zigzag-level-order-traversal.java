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
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
        q.add(root);
        q.add(null);
        boolean flag = true;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(!q.isEmpty()){
            TreeNode removeEle = q.remove();
            if(removeEle!=null){
                if(flag == true){
                    list.add(removeEle.val);
                }
                else{
                    stack.push(removeEle);
                }
                if(removeEle.left!=null){
                    q.add(removeEle.left);
                }
                if(removeEle.right!=null){
                    q.add(removeEle.right);
                }
            }
            else{
                if(!flag){
                    while(!stack.empty()){
                        list.add((stack.pop()).val);
                    }
                }
                res.add(new ArrayList<>(list));
                if(!q.isEmpty()){
                    q.add(null);
                }
                flag = flag? false:true;
                list = new ArrayList<>();
            }
        }
        return res;
    }
}