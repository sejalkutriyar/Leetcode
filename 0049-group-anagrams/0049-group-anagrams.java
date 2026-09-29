class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char[] char_array=s.toCharArray();
            Arrays.sort(char_array);
            String sorted_string=String.valueOf(char_array);
            map.putIfAbsent(sorted_string,new ArrayList<>());
            map.get(sorted_string).add(s);
        }
        List<List<String>> re=new ArrayList<>();
        for(List<String> group:map.values()){
            re.add(group);
        }
        return re;
    }
}