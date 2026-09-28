class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        int l = 0;

        for(int r = 0; r < n;r++){
            sum+= nums[r];

            while(sum >= target){
                res = Math.min(res, r-l+1);
                sum-= nums[l];
                l++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}