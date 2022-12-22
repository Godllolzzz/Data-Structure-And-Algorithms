class Solution {
    public int findNumberOfLIS(int[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        int cnt[] = new int[n];
        int max = 1;
        int ans = 0;
        Arrays.fill(dp, 1);
        Arrays.fill(cnt, 1);
        for (int i = 0; i < n; i++) {
            for (int pre = 0; pre < i; pre++) {
                if (arr[pre] < arr[i] && dp[pre] + 1 > dp[i]){
                    dp[i] = 1 + dp[pre];
                    cnt[i] = cnt[pre];
                }
                else if(arr[pre] < arr[i] && dp[i] == dp[pre] + 1) cnt[i] += cnt[pre];
            }
            max = Math.max(max, dp[i]);
        } 
        for(int i = 0; i < n ; i++) 
        if(dp[i] == max) ans += cnt[i];
        return ans;
    }
}
