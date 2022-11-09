class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //At most only two elements can be the answer,so we take the two elements here;

        int num1 = -1;
        int num2 = -1;
        int c1 = 0;
        int c2 = 0;
        for(int el : nums){
            if(el == num1) c1++;
            else if(el == num2) c2++;
            else if(c1 == 0){
                num1 = el;
                c1 = 1;
            }
            else if(c2 == 0){
                num2 = el;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0; c2 = 0;
        for(int i : nums){
            if(i == num1)c1++;
            else if(i == num2)c2++;
        }
        List<Integer> l = new ArrayList<Integer>();
        if(c1>nums.length/3)
        l.add(num1);
        if(c2>nums.length/3)
        l.add(num2);
        return l;
    }
}
