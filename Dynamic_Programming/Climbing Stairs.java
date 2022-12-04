class Solution {
    public int climbStairs(int n) {
        int i=0;int j=1;
        int steps=0;
        for(int k=0;k<n;k++){
            steps=i+j;
            i=j;
            j=steps;
        }
        return steps;
    }
}

 class Solution{
   public int climbStairs(int n){
     int dp[] = new int[n+1];
     dp[0] = 1;
     dp[1] = 1;
     for(int i = 2; i <= n; i++){
       dp[i] = dp[i-1] + dp[i-2];
     }
     return dp[n];
   }
 }
