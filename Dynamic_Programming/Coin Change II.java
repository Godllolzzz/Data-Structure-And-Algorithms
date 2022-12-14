class Solution {
    public int change(int x, int[] arr) {
        int n = arr.length;
        int dp[][] = new int[n][x+1];
        for(int row[] : dp) Arrays.fill(row, -1);
        return helper(n-1, arr, x, dp);
    }
    int helper(int ind, int arr[], int x, int dp[][]){
        if(ind == 0){
            if(x%arr[0] == 0) return 1;
            else return 0;
        }
        if(x < 0) return 0;
        if(x == 0) return 1;
        if(dp[ind][x] != -1) return dp[ind][x];
        return dp[ind][x] = helper(ind ,arr, x-arr[ind], dp) + helper(ind-1, arr, x, dp);
    }
}
