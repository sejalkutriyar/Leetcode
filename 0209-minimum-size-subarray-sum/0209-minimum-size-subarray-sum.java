class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mw=nums.length+1;
        int sum=0;
        int left = 0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                mw=Math.min(mw,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return mw==nums.length+1?0:mw;
    }
}
    
