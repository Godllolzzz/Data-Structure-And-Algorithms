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
    public int goodNodes(TreeNode root) {
        if(root == null) return 1;
        return traversal(root, -10000);
    }
    int traversal(TreeNode root, int val){
        int count = 0;
        if(root == null) return 0;
        if(root.val >= val)
        { 
            count = 1;
            val = root.val;
        }
        if(root.left != null) count+=traversal(root.left,val);
        if(root.right != null) count+=traversal(root.right,val);
        return count;
    }
}
