class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int a : nums1){
            set.add(a);
        }
        for(int i = 0 ;i < nums2.length;i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int [] ans = new int [set2.size()];
        int i = 0 ;
        for(int b : set2){
            ans[i] = b;
            i++;
        }
        return ans;
    }
}