class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int dp[][][] = new int[n][2][3];
        for(int rows[][] :dp)for(int row[] : rows)
        Arrays.fill(row ,-1);
        return helper(0, 1, p, dp, 2);
    }
    int helper(int ind, int buy, int p[], int dp[][][], int cap){
        if(cap == 0 || ind == p.length) return 0;
        if(dp[ind][buy][cap] != -1) return dp[ind][buy][cap];
        if(buy == 1)
        return dp[ind][buy][cap] = Math.max(-p[ind] + helper(ind+1, 0, p, dp, cap), helper(ind+1, 1, p, dp, cap));
        else return dp[ind][buy][cap] = Math.max(p[ind] + helper(ind+1, 1, p, dp, cap-1), helper(ind+1, 0, p, dp, cap));
    }
}
////////////////////////////////////////////////////////////////////
class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int dp[][][] = new int[n+1][2][3];
        for(int i = n; i >= 0; i--){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 3; k++){
                    if(k == 0 || i == n){
                        dp[i][j][k] = 0;
                        continue;
                    }
                    if(j == 1)
                    dp[i][j][k] = Math.max(-p[i] + dp[i+1][0][k],dp[i+1][1][k]);
                    else 
                    dp[i][j][k] = Math.max(p[i]+ dp[i+1][1][k-1],dp[i+1][0][k]);
                }
            }
        }
        return dp[0][1][2];
    }
}
/////////////////////////////////////////////////////////////////////
class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int dp[][] = new int[n][4];
        for(int rows[] :dp)
        Arrays.fill(rows ,-1);
        return helper(0, 0, p, dp);
    }
    int helper(int ind, int buy, int p[], int dp[][]){
        if(buy == 4 || ind == p.length) return 0;
        if(dp[ind][buy] != -1) return dp[ind][buy];
        if(buy % 2 == 0)
        return dp[ind][buy] = Math.max(-p[ind] + helper(ind+1, buy + 1, p, dp), helper(ind+1, buy, p, dp));
        else return dp[ind][buy] = Math.max(p[ind] + helper(ind+1, buy 
        + 1, p, dp), helper(ind+1, buy, p, dp));
    }
}
