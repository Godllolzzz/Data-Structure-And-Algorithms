class Solution {
    public int strStr(String h, String n) {
        int index=0;
        int h1=h.length();
        int n1=n.length();
        for(int i=0;i<h1;i++){
            if(h.startsWith(n)) return index;
            else{
                h=h.substring(1);
                index++;
            }
        }
        return -1;
    }
}
