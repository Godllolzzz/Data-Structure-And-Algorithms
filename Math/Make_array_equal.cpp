class Solution {
public:
  int maxFrequencyScore(vector<int>& nums, long long k) {
    sort(nums.begin(), nums.end());
    long long operation = 0, ans = 0;
    for(long long i = 0, j = 0; j < nums.size(); ++j){
        operation += nums[j] - nums[(i+j)/2];
        while(operation > k){
            operation += nums[i] - nums[(i + j + 1)/2];
            i++;
        }
        ans = max(ans, j - i + 1);
    }
    return ans;
}
};
