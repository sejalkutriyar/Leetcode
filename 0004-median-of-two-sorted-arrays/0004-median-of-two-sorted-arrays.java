class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0 ;
        int j = 0 ;
        int k = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        int [] ans = new int[len1+len2];
        while(i<len1 && j < len2){
            if(nums1[i] < nums2[j]){
                ans[k] = nums1[i];
                k++;
                i++;
            }else{
                ans[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<len1){
            ans[k] = nums1[i];
            k++;
            i++;
        }
        while(j<len2){
            ans[k] = nums2[j];
            k++;
            j++;
        }
        if(ans.length % 2 ==1){
            return ans[ans.length/2];
        }
        int a = ans[ans.length/2];
        int b = ans[ans.length/2 - 1];
        double mid = (a+b)/2.0;
        return mid;
    }
}