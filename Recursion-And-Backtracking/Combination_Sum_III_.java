class Solution {
    List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> combinationSum3(int k, int n) {
        combination(k,n,1, new ArrayList());
        return list;
    }
    void combination(int k, int n, int ind ,List<Integer> l){
       if(k == 0){
           if(n == 0)  list.add(new ArrayList<>(l));
             return;
       }


       for(int i = ind ; i<=9 ;i++) {
            if( i > n) break;
                l.add(i);
                combination(k - 1, n - i, i + 1, l);
                l.remove(l.size() - 1);
            
       }
    }
    
}
