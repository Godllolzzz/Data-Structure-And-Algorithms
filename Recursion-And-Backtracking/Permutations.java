class Solution {
    public List<List<Integer>> permute(int[] nums) {
          List<List<Integer>> list = new ArrayList<>();
        boolean mark[]=new boolean[nums.length];
        permutation(list,new ArrayList(),nums,mark);
        return list;
    }
    void permutation(List<List<Integer>> list,List<Integer> l,int[] nums,boolean[] mark){
        if(l.size()==nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
              if(!mark[i]){
            mark[i] = true;
             l.add(nums[i]);
            permutation(  list,l,nums, mark);
            l.remove(l.size()-1);
            mark[i] = false;
        }
        }
    }
}
