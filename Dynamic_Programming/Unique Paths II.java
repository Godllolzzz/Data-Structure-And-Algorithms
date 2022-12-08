class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1] == 1) return 0;
        int dp[][] = new int[m][n];
        for(int row[] : dp) Arrays.fill(row, -1);

       return traversal(m-1, n-1, dp, obstacleGrid); 
    }
    int traversal(int row, int col, int dp[][], int grid[][]){
        if(row == 0 && col == 0) return 1;
        if(dp[row][col] != -1) return dp[row][col];
        int up = 0;
        int left = 0;
        if(row > 0 && grid[row-1][col] != 1) up = traversal(row-1, col, dp, grid);
        if(col > 0 && grid[row][col-1] != 1) left = traversal(row, col-1, dp, grid);
        return dp[row][col] = up + left;
    }
}


class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        obstacleGrid[0][0] = 1;

        for (int i = 1; i < R; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }

        for (int i = 1; i < C; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        }
        for (int i = 1; i < R; i++) 
            for (int j = 1; j < C; j++) 
                if (obstacleGrid[i][j] == 0) 
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
            

        return obstacleGrid[R - 1][C - 1];
    }
}
