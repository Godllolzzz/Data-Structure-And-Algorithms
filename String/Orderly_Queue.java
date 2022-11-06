class Solution {
    public String orderlyQueue(String s, int k) {
       if(k==1){
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String ss = "";
            for(int j=0;j<k;j++){
                ss = s.substring(0,j)+s.substring(j+1)+s.charAt(j);
                list.add(ss);
            }
            s=ss;
        }
        Collections.sort(list);   
        System.out.println(list);
        return list.get(0);
        }

            char arr[] = s.toCharArray();
                Arrays.sort(arr);
        return new String(arr);
    }
}
