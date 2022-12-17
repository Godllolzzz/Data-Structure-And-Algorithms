class Solution {
    public boolean isMatch(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n][m];
        for(int row[] : dp) Arrays.fill(row, -1);
        return helper(n-1, m-1, s, t, dp) == 1 ? true : false;
    }
    int helper(int i, int j, String s, String t, int dp[][]){
        if(j < 0 && i >= 0) return 0;
        if(j < 0 && i < 0) return 1;
        if(i < 0 && j >= 0){
            for(int k = 0; k <= j ; k++){ if(t.charAt(k) != '*') return 0;}
            return 1;
        }
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == t.charAt(j) || t.charAt(j) == '?'){
                return dp[i][j] = helper(i-1, j-1, s, t, dp);
            }
        else{
            if(t.charAt(j) == '*'){
            return dp[i][j] = (helper(i, j-1, s, t, dp) == 1 || helper(i-1, j, s, t, dp) == 1) ? 1 : 0;
            }
            return dp[i][j] = 0;
        } 
    }
}
//////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public boolean isMatch(String s, String t) {
        int n = s.length();
        int m = t.length();
        boolean dp[][] = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int j = 1 ; j <= m ; j++)
            if(t.charAt(j-1) == '*') dp[0][j] = dp[0][j-1];
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
            if(s.charAt(i-1) == t.charAt(j-1) || t.charAt(j-1) == '?')dp[i][j] = dp[i-1][j-1];
            else if(t.charAt(j-1) == '*') dp[i][j] = dp[i-1][j] || dp[i][j-1];
            else dp[i][j] = false;
        }
      } 
        return dp[n][m];
    }
}
