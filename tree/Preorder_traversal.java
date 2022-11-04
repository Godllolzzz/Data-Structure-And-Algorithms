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
     List<Integer> l=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
          if(root==null) return l;
       traversal(root);

        return l;
    } void traversal(TreeNode root){
            if(root==null){ l.add(null);return;}
        l.add(root.val);
         if(root.left!=null) traversal(root.left);
        if(root.right!=null) traversal(root.right);
        }
}
