class Solution {
     List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> combinationSum2(int[] num, int t) {
         Arrays.sort(num);
        combination(num, t, new ArrayList(),0);
        return list;
    }
    void combination(int[] num, int t, List<Integer> l, int ind){
       
        if(t == 0) {
             list.add(new ArrayList<>(l));
             return;
        }
        for(int i = ind; i < num.length; i++){
            if(i > ind && num[i] == num[i-1]) continue;
           if(num[i]<=t){
            l.add(num[i]);
            combination(num, t-num[i], l ,i+1);
            l.remove(l.size()-1);
            }}
        }

      
}
