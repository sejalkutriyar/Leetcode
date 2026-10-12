class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int max = 0 ;
        for(int i = 0 ; i< piles.length ;i++){
            max = Math.max(max,piles[i]);
        }
        if(piles.length == h) {
            return max;
        }
        while(start<=max){
            int mid = start + (max-start)/2;
            long hour = 0;
            for(int i = 0; i<piles.length;i++){
                int r = piles[i]/mid;
                if(piles[i] % mid != 0){
                    r++;
                }
                hour+=r;
            }
            if(hour <= h){
                max = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}