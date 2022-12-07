import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(heights[1] - heights[0]);
        for(int i = 2; i < n; i++){
            int left = dp[i-1] + Math.abs(heights[i] - heights[i-1]);       
            int right= dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            dp[i] = Math.min(left, right);
        }
        return dp[n-1];

    }
}
