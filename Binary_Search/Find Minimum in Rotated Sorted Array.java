//  without duplicate

class Solution {
    public int findMin(int[] nums) {
        int i = 0; int j = nums.length - 1;
        int x = nums[nums.length - 1];
        while(i <= j){
            int mid = (i + j)/2;
            System.out.println(i+" "+mid+" "+j);
            if(nums[mid] > x) i = mid + 1;
            else j = mid - 1;
        }
        return nums[i];
    }
}

// with duplicate

class Solution {
    public int findMin(int[] nums) {
        int i = 0; int j = nums.length - 1;
        while(i <= j){
            int mid = (i + j)/2;
            System.out.println(i+" "+mid+" "+j);
            if(nums[mid] > nums[j]) i = mid + 1;
            else if(nums[mid] == nums[j]) j--;
            else j = mid;
        }
        return nums[i];
    }
}
