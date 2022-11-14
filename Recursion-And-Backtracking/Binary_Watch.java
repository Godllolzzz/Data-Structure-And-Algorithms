

                                                              //     Using Backtracking


class Solution {
     List<String> l = new ArrayList<String>();
    public List<String> readBinaryWatch(int turnedOn) {
        if(turnedOn >=9) return l;
       combination(10 ,turnedOn, "");
        return l; 
    }
    void combination(int n, int one, String p){
        if(n == 0){
            if(one == 0){
                int min = 0;
                int hour = 0;
                for(int  i = 9 ; i >= 0 ; i--){
                    if(i >= 4){
                        if(p.charAt(i) == '1') min+=Math.pow(2,9 - i);
                    }
                    else{
                        if(p.charAt(i) == '1') hour+=Math.pow(2,3 - i);
                    }
                }
            if(hour<12&&min<60){
                StringBuilder time = new StringBuilder();
                time.append(hour).append(':');
                if(min < 10) time.append('0').append(min);
                else time.append(min);
                l.add(time.toString());
            }
            }
            return;
        }
      
      
                                                     //     Using Maths and String,Bit Functions
      
      
      class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> l = new ArrayList<>();
        for(int h = 0; h < 12; h++)
            for(int m = 0; m < 60; m++){
                if(Integer.bitCount(h) + Integer.bitCount(m) == turnedOn){
                    l.add(String.format("%d:%02d", h, m));
                }
            }
        return l;
    }
}
         combination(n - 1, one, p + '0');
         combination(n - 1, one - 1, p + '1');
    }
}    
