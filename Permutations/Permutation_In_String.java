class Solution {
    public boolean checkInclusion(String s1, String s2) {
            if (s2.length() < s1.length()) {
            return false;
        }
        
           //By doing sorting we just checking if all the alphabets of s1 is pesent in the substrinig of the s2.
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            s1 = sort(s1);
            if (s1.equals(sort(s2.substring(i, i + s1.length())))) {
                return true;
            }
        }
        return false;
    }
    
    private String sort(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    }
