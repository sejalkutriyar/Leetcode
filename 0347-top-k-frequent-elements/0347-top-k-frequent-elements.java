class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((num, b) -> map.get(num)-map.get(b));
        int idx= 0;
        for(int key: map.keySet()){
            int freq = map.get(key);
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
        }

        while(!pq.isEmpty()){
            ans[idx++] = pq.poll();
        }
        return ans;
    }
}