class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][][] = new int [n][m][m];
        for(int row1[][] : dp) for(int row2[] : row1) Arrays.fill(row2, -1);

        return  maxChocoUtil(0, 0, m - 1, grid, dp);
    }
   static int maxChocoUtil(int i, int j1, int j2, int[][] grid,int[][][] dp) {
    if (j1 < 0 || j1 >= grid[0].length || j2 < 0 || j2 >= grid[0].length)
      return (int)(Math.pow(-10, 9));

    if (i == grid.length - 1) {
      if (j1 == j2)
        return grid[i][j1];
      else
        return grid[i][j1] + grid[i][j2];
    }

    if (dp[i][j1][j2] != -1) return dp[i][j1][j2];

    int max = Integer.MIN_VALUE;
    for (int di = -1; di <= 1; di++) {
      for (int dj = -1; dj <= 1; dj++) {
        int ans = maxChocoUtil(i + 1, j1 + di, j2 + dj, grid, dp);
        if (j1 == j2)
          ans += grid[i][j1];
        else
          ans += grid[i][j1] + grid[i][j2];
        max = Math.max(max, ans);
      }
    }
    return dp[i][j1][j2] = max;
  }
}
