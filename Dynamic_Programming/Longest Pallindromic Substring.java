class Solution {
    public int longestPalindrome(String s) {
        int m = s.length();
        StringBuilder sb = new StringBuilder(s);
        String t = sb.reverse().toString();
        int n = t.length();
        int ans = 0;
        int dp[][] = new int[m+1][n+1];
        for(int i = 0 ; i <= m ; i++){
            for(int j = 0 ; j <= n ; j++){
                 if(i == 0 || j == 0) {
                     dp[i][j] = 0; continue;
                 }
                  if(s.charAt(i-1) == t.charAt(j-1)){
                      dp[i][j] = 1 + dp[i-1][j-1];
                  }  
                  else dp[i][j] = 0;
                  ans = Math.max(ans, dp[i][j]);
                              }
        }
        return ans;
    }
}
