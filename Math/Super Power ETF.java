class Solution {
    public int superPow(int a, int[] b) {
        // ETF of 1337 = 1140.
        // so, (a^b) % 1337 = (a^(b % 1140)) % 1337.
        // calculate power(b) from the power array.
         int bmod = 0; // bmod is the power of 10, initialy it is 10^1 = 0
         for(int val : b) bmod = (bmod * 10 + val) % 1140;
         return binaryExponentiation(a, bmod, 1337);
    }
    int binaryExponentiation(int a, int b, int M){
        int  ans = 1;
        while(b>0){
            if((b&1) == 1) ans = (int)((long)ans * a % M); 
            a = (int)((long)a * a % M);
            b >>= 1;
        }
        return ans;
    }
}
