import java.util.* ;
import java.io.*; 
public class Solution {
    public static int minSumPath(int[][] grid) {
    	// Write your code here
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j  < m ; j++){
                int right = Integer.MAX_VALUE; int down = Integer.MAX_VALUE;
                if(i == 0 && j == 0) dp[0][0] = grid[0][0];
                else{
                    if(i>0) down = grid[i][j] + dp[i-1][j]; 
                    if(j>0) right = grid[i][j] + dp[i][j-1];
                    dp[i][j] = Math.min(down, right);
                }
            }
        }
        return dp[n-1][m-1];
    }
}

///////////////////////////////////////////////////////////////////////////////////////
   public static int minSumPath(int[][] grid) {
    	// Write your code here
        int n = grid.length;
        int m = grid[0].length;
        int dp[][] = new int[n][m];
        for(int row[] : dp)
        Arrays.fill(row, -1);
        return helper(grid, n-1, m-1, dp);
    }
    static int helper(int[][] grid, int row, int col, int[][] dp){
        if(row == 0 && col == 0) return grid[0][0];
        if(dp[row][col] != -1) return dp[row][col];
        int left = Integer.MAX_VALUE ; int up = Integer.MAX_VALUE;
        if(col > 0)   left = grid[row][col] + helper(grid, row, col-1, dp); 
        if(row > 0)  up = grid[row][col] + helper(grid, row-1, col, dp);
        return dp[row][col] = Math.min(left, up);
    }
}
