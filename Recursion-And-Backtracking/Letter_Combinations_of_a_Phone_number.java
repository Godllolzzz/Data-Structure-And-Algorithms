class Solution
 {
     String letters[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> l = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return l;
        Combination("",digits);
        return l;
    }
    void Combination(String p, String up){
       if(up.length() == 0){
           l.add(p);
           return;
       } 
       int num = up.charAt(0) - '0';
       for(int i = 0; i < letters[num].length(); i++){
           Combination(p + letters[num].charAt(i),up.substring(1));
       }

    }
}
