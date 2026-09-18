class Solution {
    public int maxSubArray(int[] nums) {
        int prefixSum = 0;
        int minPrefix = 0;
        int maxSum = nums[0];
        for(int num : nums) {
            prefixSum += num;
            maxSum = Math.max(maxSum, prefixSum-minPrefix);
            minPrefix = Math.min(minPrefix, prefixSum);
        }
        return maxSum;
    }
}