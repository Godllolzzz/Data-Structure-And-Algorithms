class Solution {
    public int longestCommonSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int dp[][] = new int[m][n];
        for(int row[] : dp) Arrays.fill(row, -1);
        return helper(s, m-1, t, n-1, dp);
    }
    static int helper(String s, int ind1, String t, int ind2, int dp[][]){
        if(ind1 < 0 || ind2 < 0) return 0;
        if(dp[ind1][ind2] != -1) return dp[ind1][ind2];
        if(s.charAt(ind1) == t.charAt(ind2)) return dp[ind1][ind2] = 1 + helper(s, ind1-1, t, ind2-1, dp);
        else{
          return dp[ind1][ind2] = Math.max(helper(s, ind1-1, t, ind2, dp), helper(s, ind1, t, ind2-1, dp));
      }
    }
}
//////////////////////////////////////////////////////////////

Note :- In the tabulation approach we has to shift the index with one;

class Solution {
    public int longestCommonSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int dp[][] = new int[m+1][n+1];
        for(int i = 0 ; i <= m; i++) dp[i][0] = 0;
        for(int i = 0 ; i <= n; i++) dp[0][i] = 0;
        for(int i = 1; i <= m ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(s.charAt(i-1) == t.charAt(j-1))
                   dp[i][j] = 1 + dp[i-1][j-1];
                else
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
