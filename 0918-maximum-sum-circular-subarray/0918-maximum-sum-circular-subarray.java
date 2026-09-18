class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int curr_max = nums[0];
        int curr_min = nums[0];
        int totalSum = nums[0];
        for(int i=1;i<nums.length;i++){
            totalSum+=nums[i];

            curr_max = Math.max(curr_max + nums[i] , nums[i]);
            max = Math.max(max , curr_max);

            curr_min = Math.min(curr_min+nums[i] , nums[i]);
            min = Math.min(min , curr_min);
        }
        if(max<0) return max;
        return Math.max(max , totalSum-min);
    }
}