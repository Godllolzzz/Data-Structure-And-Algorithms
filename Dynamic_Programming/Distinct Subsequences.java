class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0; i <= n ; i++){
            for(int j = 0 ; j <= m ; j++){
                if(j == 0){
                    dp[i][j] = 1; continue;
                }
                if(i == 0){
                    dp[i][j] = 0; continue;
                }
                
                if(s.charAt(i-1) != t.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j];continue;
                }
                int take = 0, not_take = 0;
                take = dp[i-1][j-1];
                not_take = dp[i-1][j];
                dp[i][j] = take + not_take;
            }
        }
        return dp[n][m];
    }
}
////////////////////////////////////////////////////////////////////////////
class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n][m];
        for(int row[] : dp) Arrays.fill(row, -1);
        return helper(n-1, m-1, s, t, dp);
    }
    int helper(int ind1, int ind2, String s, String t, int dp[][]){
        if(ind2 < 0) return 1;
        if(ind1 < 0) return 0;
        if(dp[ind1][ind2] != -1) return dp[ind1][ind2];
        if(s.charAt(ind1) != t.charAt(ind2))
        return dp[ind1][ind2] = helper(ind1-1, ind2, s, t, dp);
        int take = 0, not_take = 0;
        take = helper(ind1-1, ind2-1, s, t, dp);
        not_take = helper(ind1-1, ind2, s, t, dp);
        return dp[ind1][ind2] = take + not_take;
    }
}
