class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int maxNum = 0;
            for (int num : map.keySet()) {
                if (map.get(num) > maxFreq) {
                    maxFreq = map.get(num);
                    maxNum = num;
                }
            }
            ans[i] = maxNum;
            map.remove(maxNum);
        }
        return ans;
    }
}