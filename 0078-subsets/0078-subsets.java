class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
    void backtrack(List<List<Integer>> list, List<Integer> temp, int nums[], int idx) {
        list.add(new ArrayList<>(temp));
        for(int i = idx; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(list, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}