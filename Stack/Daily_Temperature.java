class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s = new Stack<>();
        int nwt[] = new int[temp.length];
        s.push(0);
        for(int i = 1; i < temp.length; i++){
            while(s.size()>0 && temp[s.peek()] < temp[i]){
               nwt[s.peek()] = s.size() > 0 ? i - s.peek() : 0 ;
             s.pop();
                }
            s.push(i);
        }
         
        return nwt;
    }
}
