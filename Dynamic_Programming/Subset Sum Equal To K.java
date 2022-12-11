import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        boolean dp[][] = new boolean[n][k+1];
        for(boolean row[] : dp) Arrays.fill(row, false);
        for(int i = 0 ; i < n ; i++) dp[i][0] = true;
        if(arr[0]<=k) dp[0][arr[0]] = true;
        for(int i = 1; i < n; i++){
            for(int j = 1 ; j <= k ;j++){
                 boolean not_pick = dp[i-1][j];
                   boolean pick = false;
        if(j >= arr[i])  pick = dp[i - 1][j-arr[i]];
        dp[i][j] = pick || not_pick;
            }
        }
        return dp[n-1][k];
    }
}
////////////////////////////////////////////////////////////////////////////////
import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int dp[][] = new int[n][k+1];
        for(int row[] : dp) Arrays.fill(row, -1);
        return helper(k, arr, n-1, dp);
    }
    static boolean helper(int k, int arr[], int ind, int dp[][]){
        if(k == 0) return true;
        if(ind == 0) return arr[0] == k;
        if(dp[ind][k] != -1) return dp[ind][k]==0?false:true;
        boolean pick = false;
        if(k >= arr[ind])  pick = helper(k-arr[ind], arr, ind-1, dp);
        boolean not_pick = helper(k, arr, ind-1, dp);
        dp[ind][k] = pick || not_pick ? 1 : 0;
        return pick || not_pick;
    }
}
