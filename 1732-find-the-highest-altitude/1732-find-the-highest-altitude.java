class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        for(int i = 0; i <= gain.length; i++) {
            int height = 0;
            for(int j = 0; j < i; j++) {
                height += gain[j];
            }
            max = Math.max(max, height);
        } 
        return max;
    }
}