class Solution {
    public int majorityElement(int[] nums) {
        //In this we use the moore byoce counting algorithm.
       int count=0;int me=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==me)count++;
            else if(nums[i]!=me){
                count--;
                if(count==0){
                    me=nums[i];
                    count++;
                }
            }
        }
        return me;
    }
}
