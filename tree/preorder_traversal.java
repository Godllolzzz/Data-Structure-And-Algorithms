LeetCode Logo
Problem List
5

avatar
All statuses
All languages
Accepted
6 hours ago
Java
Close
Praveen Chauhan
Praveen Chauhan
Nov 04, 2022 12:34

Details
Solution
Java
Runtime
1 ms
Beats
49.93%
Memory
42 MB
Beats
64.1%
Click to check the distribution chart
Notes
Write your notes here
Related Tags
Select tags
0/5
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
Console

Run
Submit
