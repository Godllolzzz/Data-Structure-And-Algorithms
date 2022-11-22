class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int depth = 0;
        q.offer(root);
        while(q.size() > 0){
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode node = q.poll();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            depth++;
        }
        return depth;
    }
}
