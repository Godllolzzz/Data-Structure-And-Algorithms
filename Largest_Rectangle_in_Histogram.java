class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        
        int rb[]=new int[n];    //array for next lesser element on right.
        int lb[]=new int[n];    //array for next lesser element on left.
        int max=0;
        
        Stack<Integer> s=new Stack<>();
        s.push(n-1);
        rb[n-1]=n;                                                      //inserting nle in rb.
        for(int i=n-2;i>=0;i--){
            while(s.size()>0 && h[i]<=h[s.peek()]) s.pop();
            rb[i]=s.size()>0?s.peek():n;
            s.push(i);
        }
        
        
        s=new Stack<>();
        s.push(0);
        lb[0]=-1;
        for(int i=1;i<n;i++){                                          //inserting nle on lb.
            while(s.size()>0 && h[i]<=h[s.peek()]) s.pop();
            lb[i]=s.size()>0?s.peek():-1;
            s.push(i);
        }
        
        
        for(int i=0;i<n;i++){
           
            int width= Math.abs(rb[i]-lb[i]-1);                     //calculating area at each bar.
            int area=width*h[i];
            max=Math.max(area,max);
        }
        return max;
    }
}
