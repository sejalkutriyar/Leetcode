class Solution {
    public boolean getAns(char[][]board, String word, boolean[][] vis, int i, int j, int startIndex){
        if(startIndex  == word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || vis[i][j] || board[i][j] != word.charAt(startIndex))
            return false;

        vis[i][j] = true;
        if(getAns(board, word, vis, i+1, j, startIndex+1) || 
        getAns(board, word, vis, i-1, j, startIndex+1) || 
        getAns(board, word, vis, i, j+1, startIndex+1) || 
        getAns(board, word, vis, i, j-1, startIndex+1)){
            return true;
        }
        vis[i][j] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean [m][n];
        boolean result = false;

        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0)){
                    result = getAns(board,word,vis,i,j,0);
                    if(result){
                        return true;
                    }
                }
            }
        }
        return result;
    }
}