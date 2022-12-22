class Solution {
    public int longestStrChain(String[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        int ans = 1;
        Arrays.fill(dp, 1);
        Arrays.sort(arr, Comparator.comparing(s->s.length()));
        for (int i = 0; i < n; i++) {
            for (int pre = 0; pre < i; pre++) {
                if (isPossible(arr[i], arr[pre])) dp[i] = Math.max(dp[i], 1 + dp[pre]);
            }
           ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
    boolean isPossible(String s1, String s2){
    if(s1.length() != s2.length() + 1) return false;
    
    int first = 0;
    int second = 0;
    
    while(first < s1.length()){
        if(second < s2.length() && s1.charAt(first) == s2.charAt(second)){
            first ++;
            second ++;
        }
        else first ++;
    }
    if(first == s1.length() && second == s2.length()) return true;
    else return false; 
}
}
