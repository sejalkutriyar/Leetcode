class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        backtrack(tiles, visited, "", set);
        return set.size();
    }
    public void backtrack(String tiles, boolean[] visited, String ans, HashSet<String> set) {
        for(int i = 0; i < tiles.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                String newStr = ans + tiles.charAt(i);
                set.add(newStr);
                backtrack(tiles, visited, newStr, set);
                visited[i] = false;
            }
        }
    }
}