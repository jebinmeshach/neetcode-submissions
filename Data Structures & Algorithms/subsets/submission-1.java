class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subsets = new ArrayList();
        backtrack(nums, 0, subsets, new ArrayList());
        return subsets;        
    }

    public void backtrack(int[] nums, int index, 
            List<List<Integer>> subsets,
            List<Integer> subset){

        if(index==nums.length){
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        backtrack(nums, index+1, subsets, subset);

        subset.remove(subset.size() - 1);
        backtrack(nums, index+1, subsets, subset);

    }
}
