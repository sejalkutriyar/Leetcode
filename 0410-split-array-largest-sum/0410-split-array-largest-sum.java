class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int x : nums) {
            low = Math.max(low, x);
            high += x;
        } 
        while(low  < high) {
            int mid = low + (high - low)/2;
            if(canSplit(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean canSplit(int[] nums, int k, int max) {
        int a = 1;
        int curr = 0;
        for(int x : nums) {
            if(curr + x > max) {
                a++;
                curr = x;
                if( a > k) {
                    return false;
                }
            } else {
                curr += x;
            }
        }
        return true;
    }
}