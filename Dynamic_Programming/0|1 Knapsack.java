import java.util.* ;
import java.io.*; 

public class Solution{
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
    int dp[][] = new int[n][maxWeight+1];
        for(int row[] : dp) Arrays.fill(row, -1);
        return helper(weight, value, n-1, maxWeight, dp);
    }
    static int helper(int[] weight, int[] value, int ind, int w, int dp[][]){
        if(ind == 0){
            if(w >= weight[0]) return value[0];
            else return 0;
        }
        if(dp[ind][w] != -1) return dp[ind][w];
        int not_take = helper(weight, value, ind-1, w, dp);
        int take = Integer.MIN_VALUE;
        if(w >= weight[ind]) take = value[ind] + helper(weight, value, ind-1, w - weight[ind], dp);
        return dp[ind][w] = Math.max(take, not_take);
    }
}
