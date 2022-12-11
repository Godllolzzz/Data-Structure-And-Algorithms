class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int dp[][][] = new int[n][n][n];
        for(int row[][] : dp) for(int row2[] : row) Arrays.fill(row2, -1);
        return Math.max(0, helper(grid, dp, n, 0, 0, 0));
    }
    int helper(int grid[][], int dp[][][], int n, int r1, int c1, int c2){
        int r2 = r1 + c1 - c2;
        if(r1 == n || r2 == n || c1 == n || c2 == n || grid[r1][c1] == -1 || grid[r2][c2] == -1) return -999999;
         if (r1 == n-1 && c1 == n-1) return grid[r1][c1];
        if (dp[r1][c1][c2] != -1) return dp[r1][c1][c2];
        int ans = grid[r1][c1]; 
        ans += (c1 != c2 ) ? grid[r2][c2] : 0;
        ans += Math.max( Math.max(helper(grid, dp, n, r1+1, c1, c2+1),helper(grid, dp, n, r1, c1+1, c2)), Math.max(helper(grid, dp, n, r1, c1+1, c2+1),helper(grid, dp, n, r1+1, c1, c2))); 
        return dp[r1][c1][c2] = ans;
    }
}
