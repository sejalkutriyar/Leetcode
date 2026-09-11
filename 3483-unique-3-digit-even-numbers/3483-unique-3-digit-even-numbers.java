class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> res = new HashSet<>();
        boolean[] used = new boolean[digits.length];
        find_total_even(digits, 0, 0, used, res);
        return res.size();
    }

    public static void find_total_even(int[] digits, int pos, int curr_num, boolean[] used, HashSet <Integer> res) 
    {

        //base case
        if(pos==3){
            if(curr_num % 2 == 0){
                res.add(curr_num);
            }
            return;
        }
        HashSet <Integer> seen = new HashSet<>();
        for(int i = 0; i<digits.length; i++){
            if(!used[i] && !seen.contains(digits[i])) {
                if(pos == 0 && digits[i] == 0){
                    continue;
                }
                seen.add(digits[i]);
                used[i] = true;
                //if(curr_num >= 100 && curr_num % 2 == 0){    
                find_total_even(digits, pos+1, curr_num*10 + digits[i], used, res);
                used[i] = false;
            }
        }
    }
}