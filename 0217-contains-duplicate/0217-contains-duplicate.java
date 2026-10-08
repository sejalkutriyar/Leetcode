class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int s : nums) {
            set.add(s);
        }
            if(nums.length == set.size()) {
                return false;
            }
        
        return true;
    }
}