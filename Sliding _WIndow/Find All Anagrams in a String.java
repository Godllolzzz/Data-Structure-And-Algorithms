class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList();
        int arr[] = new int[26];
        for(int i = 0;i < p.length(); i++) arr[p.charAt(i) - 'a']++;
       for(int i = 0;i <= s.length() - p.length(); i++ ){
           String check = s.substring(i, i + p.length());
            int arr2[] = new int[26];
            for(int j = 0;j < p.length(); j++) arr2[check.charAt(j) - 'a']++;
            if(Arrays.equals(arr,arr2)) l.add(i);
       }
       return l;
    }
}
