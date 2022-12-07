import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int n = nums.size();
       int prev = nums.get(0);
        int prev1 = 0;
        for(int i = 1; i < n; i++){
            int pick = nums.get(i) + prev1;
            int not_pick = prev;
            prev1 = prev;
            prev = Math.max(pick, not_pick);
        }
		return prev;
	}
}
