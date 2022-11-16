class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet();
        Set<String> set2 = new HashSet();
        List<String> l = new ArrayList<>();
        for(int i = 0; i <= s.length() - 10; i++){
         if(!set.add(s.substring(i,i+10))) set2.add(s.substring(i,i+10));
       }
       return new ArrayList(set2);
    }
}
