import java.util.* ;
import java.io.*; 
public class Solution {
	public static int minSubsetSumDifference(int[] arr, int n) {
		// Write your code here.
        int sum = 0;
        for(int ele : arr) sum += ele;
        boolean dp[][] = new boolean[n][sum + 1];
        for(int i = 0 ; i < n; i++) dp[i][0] = true;
        dp[0][arr[0]] = true;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            for(int target = 1; target <= sum; target++){
                boolean not_pick = dp[i-1][target];
                boolean pick = false;
                if(arr[i] <= target) pick = dp[i-1][target - arr[i]];
                dp[i][target] = not_pick || pick;
            }
        }
        for(int i =0; i <= sum; i++)
            if(dp[n-1][i]) min = Math.min(min, Math.abs(sum - 2 * i));
        return min;
	}
}
