class Solution {
    public boolean reorderedPowerOf2(int n) {
        int A[] = frequency(n);
        for(int i = 0; i < 32; i++){
            if(Arrays.equals(A,frequency(1<<i))) return true;
        }
        return false;
    }
    int[] frequency(int n){
        int freq[] = new int[10];
        while(n > 0){
            freq[n % 10]++;
            n /= 10;
        }
        return freq;
    }
}
