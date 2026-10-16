class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return res;
    }

    public void backtrack(int[] nums, int idx, List<Integer> curr){
        res.add(new ArrayList<>(curr));

        for(int i = idx; i < nums.length;i++){
            if(i > idx && nums[i] == nums[i - 1])   continue;
            curr.add(nums[i]);
            backtrack(nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}