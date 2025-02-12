class Solution {
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums , boolean[] used){
   if(tempList.size() == nums.length){
      
      list.add(new ArrayList<>(tempList));
      return;
   }
   
      for(int i = 0; i < nums.length; i++){ 
        if(used[i]){continue;}
        if(i>0 && nums[i-1]==nums[i] && !used[i-1]){
            continue;
        }
        used[i]=true;
         tempList.add(nums[i]);
         backtrack(list, tempList, nums ,used);
         used[i] = false;
         tempList.remove(tempList.size() - 1);
      }
   
}

        public List<List<Integer>> permuteUnique(int[] nums) {
   List<List<Integer>> list = new ArrayList<>();
   Arrays.sort(nums); // not necessary
   backtrack(list, new ArrayList<>(), nums ,new boolean[nums.length]);
   return list;
}
    }




