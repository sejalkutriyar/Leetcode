class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        boolean [] seen = new boolean[10];
        int common = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int ans = 0;
        for(int num : nums1){
            min1 = Math.min(min1,num);
            seen[num]  = true; 
            
        }
        for(int n : nums2){
            if(seen[n] == true){
                common = Math.min(common,n);
            }
            min2 = Math.min(min2,n);
        }
        if(common != Integer.MAX_VALUE){
            return common;
        }
        if(min1 <= min2){
            ans = min1 * 10 + min2;
        }else{
            ans = min2 * 10 + min1;
        }
        return ans;
    }
}