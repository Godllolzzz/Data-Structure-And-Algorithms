class Solution {
    public int minCut(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp,-1);
        return part(0, s, dp);    
    }
    int part(int ind, String s, int dp[]){
        if(ind == s.length()) return -1;
        if(dp[ind] != -1) return dp[ind];
        int min_cost = Integer.MAX_VALUE;
        for(int i = ind ; i < s.length() ; i++){
            if(isPallindrome(ind, i, s)){
                int cost = 1 + part(i + 1, s, dp);
                min_cost = Math.min(min_cost,cost);
            }
        }
        return dp[ind] = min_cost;
    }
    boolean isPallindrome(int i, int j, String s){
        while(i <= j){
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
