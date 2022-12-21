//////////////////////////////////// PRINTING THE LIS
class Solution {
    public int lengthOfLIS(int[]arr) {   
        int n = arr.length; 
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int[] hash=new int[n];
        Arrays.fill(hash,1);
        for(int i=0; i<=n-1; i++){  
            hash[i] = i; // initializing with current index
            for(int prev_index = 0; prev_index <=i-1; prev_index ++){
                if(arr[prev_index]<arr[i] && 1 + dp[prev_index] > dp[i]){
                    dp[i] = 1 + dp[prev_index];
                    hash[i] = prev_index;
                }
            }
        }  
        int ans = -1;
        int lastIndex =-1;
        for(int i=0; i<=n-1; i++){
            if(dp[i]> ans){
                ans = dp[i];
                lastIndex = i;
            }
        }
        
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(arr[lastIndex]);
        
        while(hash[lastIndex] != lastIndex){ // till not reach the initialization value
            lastIndex = hash[lastIndex];
            temp.add(0,arr[lastIndex]);    
        }
        System.out.println(temp);
        
    return ans;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][n+1];
        for(int row[] : dp)
        Arrays.fill(row, -1);
        return f(0, nums, dp, -1);
    }
    int f(int ind, int arr[], int dp[][], int prev_index){         
    if(ind == arr.length) return 0;
    if(dp[ind][prev_index+1] != -1) return dp[ind][prev_index+1];
    int notTake = 0 + f(ind + 1, arr, dp, prev_index);
    int take = 0;
    if(prev_index == -1 || arr[ind]>arr[prev_index]) take = 1 + f(ind+1,arr, dp,ind);
    return dp[ind][prev_index+1] = Math.max(notTake, take);
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {
    public int lengthOfLIS(int[]arr) {
        int n = arr.length;
        int curr[] = new int[n+1];
        int next[] = new int[n+1];
        for(int i = n-1 ; i >= 0 ; i--){
            for(int j = i-1 ; j >= -1 ; j--){
                int notTake = 0 + curr[j+1];
                int take = 0;
                if(j == -1 || arr[i]>arr[j]) take = 1 + curr[i+1];
                 next[j+1] = Math.max(notTake, take);
            }
            curr = next.clone();
        }
        return curr[0];
    }
}
