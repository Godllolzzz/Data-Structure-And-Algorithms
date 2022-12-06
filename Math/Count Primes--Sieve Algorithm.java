class Solution {
    public int countPrimes(int n) {
        int ans = 0;
        if(n == 0 || n == 1) return 0;
        boolean check[] = new boolean[n];
        Arrays.fill(check, true);
        check[0] = false;
        check[1] = false;
        for(int i = 2; i < n; i++){
             if(check[i]){
                 for(int j = 2*i; j < n; j += i) check[j] = false;
             }
        }
        for(boolean is : check) if(is) ans++;
        return ans;
    }
}
