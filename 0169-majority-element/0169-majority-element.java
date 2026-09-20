class Solution {
    public int majorityElement(int[] nums) {
        int vote = 1;
        int num = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == num) {
                vote++;
            } else {
                vote--;
            }
            if(vote == 0) {
                num = nums[i];
                vote=1;
            }
        }
        return num;
    }
}