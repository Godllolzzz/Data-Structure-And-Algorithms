class Solution {
    public String shortestCommonSupersequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0; i <= n ; i++){
            for(int j = 0; j <= m ; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                    continue;
                }
                if(s.charAt(i-1)==t.charAt(j-1))dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = n; int j = m;

        while(i > 0 && j > 0){
            if(s.charAt(i-1) == t.charAt(j-1)){
                sb.append(s.charAt(i-1));
                i--;j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]){
                sb.append(s.charAt(i-1));
                i--;
            }
            else{
                sb.append(t.charAt(j-1));
                j--;
            }
        }

        while(i-- > 0)sb.append(s.charAt(i));
        while(j-- > 0)sb.append(t.charAt(j));
        return sb.reverse().toString();
    }
}
