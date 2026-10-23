class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        String ans = "";
        while(!pq.isEmpty()) {
            char temp = pq.poll();
            while(map.get(temp) != 0) {
                ans += temp;
                map.put(temp, map.get(temp) - 1);
            }
        }
        return ans;
    }
}