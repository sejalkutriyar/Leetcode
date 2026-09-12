class Solution {
    public int addDigits(int num) {
        
        int sum = 0;
        while(num > 0){
            int ans = num % 10;
            sum = sum + ans;
            num = num/10;
        }
        if (sum < 10) {
            return sum;
        } else {
            while(sum >= 10) {
                int ans = sum % 10;
                sum = sum/10;
                sum=sum+ans;
            }
        }
        return sum;
    }
}