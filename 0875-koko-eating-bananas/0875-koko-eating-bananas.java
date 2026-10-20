class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for(int m : piles){
            max = Math.max(m,max);
        }
        while(min <= max){
            int mid = min + (max- min)/2;
            long hour = 0;
            for(int i = 0 ; i<piles.length;i++){
                int r = piles[i]/mid;
                if(piles[i] % mid != 0){
                    r++;
                }
                hour+=r;
            }
            if(hour <= h){
                max = mid -1;
            }else{
                min = mid+1;
            }
        }
        return min;
    }
}