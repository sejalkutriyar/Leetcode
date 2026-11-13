class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean vis[][] = new boolean[row][col];
        boolean result=false;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(word.charAt(0)==board[i][j]){
                    result=backtrack(board,word,row,col,i,j,vis,0);
                    if(result)return true;
                }
            }
        }
        return false;
    }
    boolean backtrack(char[][] board,String word,int row,int col,int i,int j,boolean[][]vis,int ind){
        if(ind==word.length())return true;
        if(i<0||i>=row||j<0||j>=col||vis[i][j]||board[i][j]!=word.charAt(ind)){
            return false;
        }
        vis[i][j]=true;

        if(backtrack(board,word,row,col,i+1,j,vis,ind+1)||
        backtrack(board,word,row,col,i-1,j,vis,ind+1)||
        backtrack(board,word,row,col,i,j+1,vis,ind+1)||
        backtrack(board,word,row,col,i,j-1,vis,ind+1)){
            return true;
        }
        vis[i][j]=false;
        return false;
    }
}