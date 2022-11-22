class Solution {
    int path_dis = 0;
    public int diameterOfBinaryTree(TreeNode root) { 
        int h = height(root);
        return path_dis;
    }
    int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        path_dis = Math.max(path_dis, lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
