class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int ind = 0;
        long min = Long.MAX_VALUE;
        long lsum = 0; long fsum = 0;
        for(int i : nums) lsum += i;
        for(int i = 0; i < n; i++){
            fsum += nums[i]; lsum -=  nums[i];
            long lavg = 0;
            if(i != n-1)  lavg = (lsum)/(n-(i+1));
            long diff = Math.abs((fsum)/(i+1) - lavg);
            if(diff<min){
                min = diff;
                ind = i;
            }
        }
        return ind;
    }
}
