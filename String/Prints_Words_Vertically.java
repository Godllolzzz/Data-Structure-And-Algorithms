class Solution {
    public List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        String[] words=s.split("\\s");
        int max = 0;
        for(String ss : words) max = Math.max(max,ss.length());
        // System.out.println(max);
        
        int index = 0;
        while(index<max){
            String input = "";
        for(int i=0;i<words.length;i++){
                if(words[i].length()<=index)
                input+= " ";
                else{
                    char c = words[i].charAt(index);
                    input = input.substring(0) + c;
                }
             }
         list.add(trimRight(input));
                index++;
    }
      return list;
    }
    String trimRight(String input){
        int i=input.length();
        while(i>=0){
            if(input.charAt(i-1) != ' ') return input.substring(0,i);
            i--;
        }
        return null;
    }
}
