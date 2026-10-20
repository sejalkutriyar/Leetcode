class Solution {
    public int[] searchRange(int[] nums, int target) {
        int indexstart = helper(nums,target,true);
        if(indexstart == -1){
            return new int[]{-1,-1};
        }
        int endindex = helper(nums,target,false);
        return new int[]{indexstart,endindex};
        
    }
    public int helper(int [] nums,int target,boolean cond){
        int left = 0 ;
        int right = nums.length-1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                ans = mid;
                if(cond){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}