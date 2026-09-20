class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for(int i = 0 ; i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            list.add(nums[i]);
        }
        for(int i = min ; i<=max ; i++){
            if(!list.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}