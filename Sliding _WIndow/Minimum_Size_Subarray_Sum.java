class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ind = 0;int i = 0;int ans = Integer.MAX_VALUE;int sum = 0;
         while(i<nums.length){
             sum+=nums[i];
             while(sum >= target){
                 ans = Math.min(ans, i - ind + 1);
                 sum-=nums[ind];
                 ind++;
             }
             i++;
         }
         return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
