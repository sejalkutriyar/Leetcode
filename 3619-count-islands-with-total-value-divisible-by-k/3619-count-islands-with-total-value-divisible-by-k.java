class Solution {
    public int countIslands(int[][] grid, int k) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0 && !visited[i][j]) {
                    int sum = dfs(grid, i, j, visited);
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }   
        return count;
    }
    private int dfs(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        int sum = grid[i][j];
        sum += dfs(grid, i + 1, j, visited);
        sum += dfs(grid, i - 1, j, visited);
        sum += dfs(grid, i, j + 1, visited);
        sum += dfs(grid, i, j - 1, visited);
        return sum;
    }
}