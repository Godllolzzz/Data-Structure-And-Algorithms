class Solution {
    List<List<String>> list = new ArrayList();
    public List<List<String>> partition(String s) {
        part(s, 0, new ArrayList());
        return list;
    }
    void part(String s, int ind, List<String> l){
        if(ind == s.length()){
            list.add(new ArrayList(l));
            return;
        }
        for( int i = ind ; i < s.length() ; i++){
            if(isPallindrome(ind, i, s)){
                l.add(s.substring(ind, i + 1));
                part(s, i + 1, l);
                l.remove(l.size() - 1);
            }
        }
    }
    boolean isPallindrome(int start, int end, String s){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
