class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n == 1 || arr[1] < arr[0]) return false;
        int flag = 0;
        for(int i = 1; i < n ; i++){
            if(arr[i] == arr[i-1]) return false;
            else if(flag == 0){
                if(arr[i] > arr[i-1]) continue;
                else flag = 1;
            }
            else if(flag == 1){
                if(arr[i] > arr[i-1]) return false;
            }
        }
        return flag == 1;
    }
}
