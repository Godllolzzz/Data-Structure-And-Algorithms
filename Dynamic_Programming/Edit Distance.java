class Solution {
    public int minDistance(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n+1][m+1];
        for(int row[] : dp) Arrays.fill(row, -1);
        return helper(n-1, m-1, s, t, dp);
    }
    int helper(int i, int j, String s, String t, int dp[][]){
        if(i < 0) return j+1;
        if(j < 0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == t.charAt(j)) 
        return dp[i][j] = helper(i-1, j-1, s, t, dp);
        return dp[i][j] = 1 + Math.min(helper(i-1, j, s, t, dp), Math.min(helper(i, j-1, s, t, dp), helper(i-1, j-1, s, t, dp)));
    }
}
////////////////////////////////////////////////////////////////////
class Solution {
    public int minDistance(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0 ; i <= n ;i++){
            for(int j = 0 ; j <= m; j++){
                if(i == 0){
                    dp[i][j] = j;
                    continue;
                }
                if(j == 0){
                    dp[i][j] = i;
                    continue;
                }
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                    continue;
                } 
                dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
            }
        }
        return dp[n][m];
    }
}
////////////////////////////////////////////////////////////////////////////
class Solution {
    public int minDistance(String s, String t) {
        int n = s.length();
        int m = t.length();
        int prev[] = new int[m+1];
        int curr[] = new int[m+1];
        for(int j=0;j<=m;j++){
            prev[j] = j;
        }
        for(int i = 1 ; i <= n ;i++){
            curr[0] = i;
            for(int j = 1 ; j <= m; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    curr[j] = prev[j-1];
                    continue;
                } 
                curr[j] = 1 + Math.min(prev[j], Math.min(curr[j-1], prev[j-1]));
            }
            prev = (int[])(curr.clone());
        }
        return prev[m];
    }
}
