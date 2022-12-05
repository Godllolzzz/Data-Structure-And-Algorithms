class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {

        // First we find the max power that can come under the bound.
        int a = x == 1 ? bound : (int)(Math.log(bound)/Math.log(x));
        int b = y == 1 ? bound : (int)(Math.log(bound)/Math.log(y));

        // take a hashset as 2^3 + 3^1 == 2^1 +3^2.
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                int val = (int)Math.pow(x, i) + (int)Math.pow(y, j);
                if(val <= bound) set.add(val);
                if(y == 1)break;
            }
                if(x == 1)break;
        }
        return new ArrayList<>(set);
    }
}
