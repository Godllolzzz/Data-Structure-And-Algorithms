import java.util.* ;
import java.io.*; 
public class Solution {
	public static long houseRobber(int[] valueInHouse) {
        if(valueInHouse.length == 1) return valueInHouse[0];
                int n = valueInHouse.length;
        long l = maximumNonAdjacentSum(Arrays.copyOfRange(valueInHouse, 0,n-1));
        long r = maximumNonAdjacentSum(Arrays.copyOfRange(valueInHouse, 1,n));
        return Math.max(l,r);
	}	
        public static long maximumNonAdjacentSum(int[] nums) {
            int n = nums.length;
            long prev = nums[0];
            long prev1 = 0;   
        for(int i =1; i < n;i++){
            long pick = nums[i] + prev1;
            long not_pick = prev;
            prev1 = prev;
            prev = Math.max(pick, not_pick);
        }
        return prev;
    }
