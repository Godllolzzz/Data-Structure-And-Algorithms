class Solution {
    int trans;
    public int maxProfit(int k, int[] p) {
        int n = p.length;
        trans = 2 * k;
        int dp[][] = new int[n][trans];
        for(int rows[] :dp)
        Arrays.fill(rows ,-1);
        return helper(0, 0, p, dp);
    }
    int helper(int ind, int buy, int p[], int dp[][]){
        if(buy == trans || ind == p.length) return 0;
        if(dp[ind][buy] != -1) return dp[ind][buy];
        if(buy % 2 == 0)
        return dp[ind][buy] = Math.max(-p[ind] + helper(ind+1, buy + 1, p, dp), helper(ind+1, buy, p, dp));
        else return dp[ind][buy] = Math.max(p[ind] + helper(ind+1, buy 
        + 1, p, dp), helper(ind+1, buy, p, dp));
    }
}
/////////////////////////////////////////////////////////////////////
class Solution {
    int trans;
    public int maxProfit(int k, int[] p) {
        int n = p.length;
        trans = 2 * k;
        int dp[][] = new int[n+1][trans+1];
        for(int i = n; i >= 0; i--){
            for(int j = trans; j >= 0; j--){
                if(i == n || j == trans){
                    dp[i][j] = 0; continue;
                }
                if(j%2 == 0) dp[i][j] = Math.max(-p[i] + dp[i+1][j+1],dp[i+1][j]);
                else dp[i][j] = Math.max(p[i] + dp[i+1][j+1], dp[i+1][j]);
            }
        }
        return dp[0][0];
    }
}
