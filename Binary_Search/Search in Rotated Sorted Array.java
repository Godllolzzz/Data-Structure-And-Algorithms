// without duplicate 

class Solution {
    public int search(int[] nums, int t) {
        int low = 0;
        if(nums[0] == t) return 0;
        if(nums[nums.length-1] == t) return nums.length-1;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (high + low + 1)/2;
            System.out.println(low+" "+mid+" "+high);
            if(nums[mid] == t) return mid;
            if(nums[mid]  > nums[low]){
                if(nums[mid] > t && nums[low] <= t) high = mid - 1;
                else low = mid + 1;
            }
            else{
                if(nums[mid] < t && nums[high] >= t) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }
}

//  with duplicate

class Solution {
    public boolean search(int[] nums, int t) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low + 1)/2;
            System.out.println(low+" "+mid+" "+high);
            if(nums[mid] == t) return true;
            if(nums[mid] == nums[low] && nums[mid] == nums[high]){
                low++;
                high--;
            }
            else if(nums[mid]  >= nums[low]){
                if(nums[mid] > t && nums[low] <= t) high = mid - 1;
                else low = mid + 1;
            }
            else{
                if(nums[mid] < t && nums[high] >= t) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }
}
