class Solution {
    List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> combinationSum(int[] num, int t) {
        combination(num, t, new ArrayList(),0);
        return list;
    }
    void combination(int[] num, int t, List<Integer> l, int i){
       
        if(i == num.length){
             if(t == 0) list.add(new ArrayList<>(l));
             return;
        }
        // for(int i = 0; i<num.length && num[i]<=t; i++){
           if(num[i]<=t)
            {l.add(num[i]);
            combination(num, t-num[i], l ,i);
            l.remove(l.size()-1);}
            combination(num , t , l, i+1);
        }

      
}
