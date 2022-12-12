class Solution {
    int dp[][];
    int min = Integer.MAX_VALUE;
    public int minimizeTheDifference(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;
        dp=new int[mat.length][50000]; 
        helper(0, mat, target, 0);
         
        return min;
    }
    void helper(int r, int mat[][], int target, int sum){
        if(r >= mat.length){
           min = Math.min(min, Math.abs(target-sum));
           return; 
        }
        if(dp[r][sum] == 1) return;
        for(int i = 0; i < mat[0].length; i++){
            helper(r+1, mat, target, sum+mat[r][i]);
        }
        dp[r][sum] = 1;
    }
}
