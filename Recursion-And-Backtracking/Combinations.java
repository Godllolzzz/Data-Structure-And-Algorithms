class Solution {
    List<List<Integer>> list= new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
       rec(n , k, new ArrayList() , 1);
       return list;
    }
    void rec(int n, int k, List<Integer> l, int ind){
       if(l.size() == k){
           list.add(new ArrayList<>(l));
           return;
       }
       for( int i = ind ; i <= n ; i++){
           l.add(i);
           rec(n, k, l, i+1);
           l.remove(l.size()-1);
       }
    }
}
