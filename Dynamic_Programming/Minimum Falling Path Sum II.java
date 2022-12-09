class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        int dp[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++) dp[0][i] = matrix[0][i];

        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                int min = Integer.MAX_VALUE;
                for(int k = 1; k <= n ; k++){
                    int left = j >= k ? dp[i-1][j-k] + matrix[i][j] : 100000;
                    int right = j+k < n ? dp[i-1][j+k] + matrix[i][j] : 100000;
                    min = Math.min(min, Math.min(left, right));
                }
                dp[i][j] = min;
            }
        }
            
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++) min = Math.min(min, dp[n-1][i]);
            return min;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int min = Integer.MAX_VALUE;
        int dp[][] = new int[n][n];
        for(int row[] : dp) Arrays.fill(row, -1);
        for(int i = 0 ; i < n ; i++)
            min = Math.min(min, helper(matrix, i, n - 1, dp));

            return min;
    }
    int helper(int matrix[][], int col, int row, int dp[][]){
        if(col < 0 || col >= matrix.length) return 100000;
        if(row == 0) return matrix[row][col];
        if(dp[row][col] != -1) return dp[row][col];
        int left = matrix[row][col] + helper(matrix, col-1, row-1, dp);
        int right = matrix[row][col] + helper(matrix, col+1, row-1, dp);
        return dp[row][col] =  Math.min(left, right);        
    }
}
