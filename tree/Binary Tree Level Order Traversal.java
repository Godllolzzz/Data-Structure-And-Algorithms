class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return list;
        q.offer(root);
        
        while(!q.isEmpty()){
        ArrayList<Integer> l = new ArrayList<>();
        int size = q.size();
        for(int i = 0; i < size; i++){
            l.add(q.peek().val);
            if(q.peek().left != null) q.offer(q.peek().left);
            if(q.peek().right != null) q.offer(q.peek().right);
            q.remove();
        }
        list.add(l);
        }
        return list;
    } 
}
