class Solution {
    public int coinChange(int[] arr, int x) {
        int n = arr.length;
        int dp[][] = new int[n][x+1];
        for(int row[] : dp) Arrays.fill(row, -1);
        int ans = helper(arr, x, n-1, dp);
        return ans == 10000000 ? -1 : ans;
    }
    int helper(int arr[], int x, int ind, int dp[][]){
        if(ind == 0){
            if(x%arr[0] == 0) return x/arr[0];
            else return 10000000;
        }
         if(dp[ind][x] != -1) return dp[ind][x];
         int take = Integer.MAX_VALUE;
        if(x >= arr[ind]) take = 1 + helper(arr, x-arr[ind], ind, dp);
        int not_take = helper(arr, x, ind-1, dp);
        return dp[ind][x] = Math.min(take, not_take);
    }
}
