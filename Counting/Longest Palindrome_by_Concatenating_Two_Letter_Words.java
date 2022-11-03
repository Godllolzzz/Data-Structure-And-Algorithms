class Solution {
    public int longestPalindrome(String[] words) {
        int count=0;
        int arr[][] =new int[26][26];
        for(String s:words){
            int i=s.charAt(0)-'a';
            int j=s.charAt(1)-'a';
            
            if(arr[j][i]>0){
                count+=4;
                arr[j][i]--;
            }
            else arr[i][j]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i][i]>0) {count+=2; break;}
        }
        return count;
    }
}
