class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0 && j == 0) dp[i][j] = 1;
                if(i>0) dp[i][j] += dp[i-1][j];
                if(j>0) dp[i][j] += dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}


class Solution {
    public int uniquePaths(int m, int n) {

        int dp[][] = new int[m][n];
        for(int row[] : dp) Arrays.fill(row, -1);

       return traversal(m-1, n-1, dp); 
    }
    int traversal(int row, int col, int dp[][]){
        if(row == 0 && col == 0) return 1;
        if(dp[row][col] != -1) return dp[row][col];
        int up = 0;
        int left = 0;
        if(row > 0) up = traversal(row-1, col, dp);
        if(col > 0) left = traversal(row, col-1, dp);
        return dp[row][col] = up + left;
    }
}
