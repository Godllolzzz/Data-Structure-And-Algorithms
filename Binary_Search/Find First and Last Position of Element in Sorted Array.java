class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{helper1(nums, target), helper2(nums, target)};
    }
    int helper1(int nums[], int x){
        int ans = -1;
        int l = 0; int r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == x){
                ans = mid; r = mid - 1;
            }
            else if(nums[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return ans;
    }
    int helper2(int nums[], int x){
        int ans = -1;
        int l = 0; int r = nums.length - 1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == x){
                ans = mid; l = mid + 1;
            }
            else if(nums[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return ans;
    }
}
