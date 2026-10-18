class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(String str : words1) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for(String str : words2) {
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }
        int count = 0;
        for(String str : map.keySet()) {
            if(map2.containsKey(str) && map2.get(str) == 1 && map.get(str) == 1) {
                count++;
                
            }
        }
        return count;
    }
}