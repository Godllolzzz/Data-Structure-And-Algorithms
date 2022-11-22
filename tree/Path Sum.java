
                                                     // By using DFS

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
     if(root == null) return false;
     if(root.left == null && root.right == null && root.val == targetSum) return true;
     return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}

                                                     // By using BFS

 class pair{
     TreeNode node;
     int sum ;
     public pair(TreeNode node, int sum){
         this.node = node;
         this.sum = sum;
     }
 }
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(root,root.val));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                pair p = q.poll();
                if(p.node.left != null) q.offer(new pair(p.node.left, p.sum + p.node.left.val));
                if(p.node.right != null) q.offer(new pair(p.node.right, p.sum + p.node.right.val));
                if(p.sum == targetSum && p.node.left == null && p.node.right == null) return true;
            }
        }
        return false;
    }
}
