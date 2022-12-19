class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int dp[][] = new int[n][2];
        for(int row[] :dp)
        Arrays.fill(row ,-1);
        return helper(0, 1, p, dp);
    }
    int helper(int ind, int buy, int p[], int dp[][]){
        if(ind == p.length) return 0;
        if(dp[ind][buy] != -1) return dp[ind][buy];
        if(buy == 1)
        return dp[ind][buy] = Math.max(-p[ind] + helper(ind+1, 0, p, dp), helper(ind+1, 1, p, dp));
        else return dp[ind][buy] = Math.max(p[ind] + helper(ind+1, 1, p, dp), helper(ind+1, 0, p, dp));
    }
}
////////////////////////////////////////////////////////////////////////////
class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int dp[] = new int[2];
        int prev[] = new int[2];
        prev[0] = 0; prev[1] = 0;
        for(int i = n-1 ; i >= 0 ; i--){
            for(int j = 0; j < 2; j++){
                if(j == 1) dp[j] = Math.max(-p[i] + prev[0], prev[1]);
                else dp[j] = Math.max(p[i] + prev[1], prev[0]);
            }
            prev = dp.clone();
        }
        return prev[1];
    }
}
