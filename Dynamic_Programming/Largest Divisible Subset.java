class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        int ans = 1;
        int last_index = 0;
        Arrays.fill(dp, 1);
        int hash[] = new int[n];
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            hash[i] = i;
            for (int pre = 0; pre < i; pre++) {
                if (arr[i] % arr[pre] == 0 && dp[i] < dp[pre] + 1) {
                    dp[i] = 1 + dp[pre];
                    hash[i] = pre;
                }
            }
            if (dp[i] > ans) {
                ans = dp[i];
                last_index = i;
            }
        }
        ArrayList<Integer> l = new ArrayList<>();
        while (hash[last_index] != last_index) {
            l.add(arr[last_index]);
            last_index = hash[last_index];
        }
        l.add(arr[last_index]);
        return l;
    }
}
