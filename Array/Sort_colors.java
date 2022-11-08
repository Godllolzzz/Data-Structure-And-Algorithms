class Solution {
    public void sortColors(int[] nums) {
       // Dutch National Flag Problem 
       //In this we ar taking three pointer all the elements before index left is '0' and all the indices after the right pointer is '1'. we take the help of mid pointer to do so.
       int l = 0;
       int m = 0;
       int r = nums.length - 1;
       while( m <= r){
           if( nums[m] == 1) m++;
           else if( nums[m] == 0) {
               swap(nums,m,l);
               l++;
               m++;
           }
           else{
               swap(nums,m,r);
               r--;
           }
        }
    }
    void swap( int nums[] , int i , int  j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
