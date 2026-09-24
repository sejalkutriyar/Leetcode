class Solution {
    public int findPeakElement(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int count = 0;
        s.push(nums[0]);
        for(int i = 1; i<nums.length;i++){
            if(nums[i]> s.peek()){
                s.push(nums[i]);
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
}