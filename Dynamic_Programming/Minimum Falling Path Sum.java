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
        int up = matrix[row][col] + helper(matrix, col, row-1, dp);
        int left = matrix[row][col] + helper(matrix, col-1, row-1, dp);
        int right = matrix[row][col] + helper(matrix, col+1, row-1, dp);
        return dp[row][col] = Math.min(up, Math.min(left, right));        
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int minFallingPathSum(int[][] matrix) {
           int n = matrix.length;
    
    int dp[][] = new int[n][n];
    
    // Initializing first row - base condition
    for(int j=0; j<n; j++){
        dp[0][j] = matrix[0][j];
    }
    
    for(int i=1; i<n; i++){
        for(int j=0;j<n;j++){
            
            int up = matrix[i][j] + dp[i-1][j];
            
            int leftDiagonal= matrix[i][j];
            if(j-1>=0) leftDiagonal += dp[i-1][j-1];
            else leftDiagonal += 100000;
            
            int rightDiagonal = matrix[i][j];
            if(j+1<n) rightDiagonal += dp[i-1][j+1];
            else rightDiagonal += 100000;
            
            dp[i][j] = Math.min(up, Math.min(leftDiagonal,rightDiagonal));
            
        }
    }
    
    int maxi = Integer.MAX_VALUE;
    
    for(int j=0; j<n;j++){
        maxi = Math.min(maxi,dp[n-1][j]);
    }
    
    return maxi;
    }
}
