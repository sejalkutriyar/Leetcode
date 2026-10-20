class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a : nums){
            set.add(a);
        }
        int length = 0;
        for(int i: set){
            if(!set.contains(i-1)){
                int current = i;
                int count = 1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                length = Math.max(length,count);
            }
        }
        return length;
    }
}