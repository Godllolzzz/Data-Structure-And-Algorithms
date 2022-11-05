class Solution {
    public int[] secondGreaterElement(int[] nums) {
        Stack<Integer> s2 = new Stack<>();   //for elements that have find there first ge but not second ge.
        Stack<Integer> s1 = new Stack<>();//for elements that have not find there first ge.
        Stack<Integer> temp = new Stack<>();  //for maintaining order while transferring element from s1 to s2.
        int res[]=new int[nums.length];
        Arrays.fill(res,-1);
        for(int i=0;i<nums.length;i++){
            while(!s2.isEmpty() && nums[s2.peek()]<nums[i])
                res[s2.pop()] = nums[i];
            while(!s1.isEmpty() && nums[s1.peek()]<nums[i])
                temp.push(s1.pop());
            while(!temp.isEmpty())
                 s2.push(temp.pop());

                 s1.push(i);        
         
        }   return  res;
    }
}
