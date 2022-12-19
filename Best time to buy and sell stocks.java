class Solution {
    public int maxProfit(int[] p) {
        int lp=Integer.MAX_VALUE;//least price;
        int cp=0;//current profit
        int op=0;//overall profit
        for(int i=0;i<p.length;i++){
            lp=Math.min(lp,p[i]);
            
            cp=p[i]-lp;
            op=Math.max(cp,op);
            
        }
        return op;
    }
}
