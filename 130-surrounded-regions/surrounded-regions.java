class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i =0;i<m;i++){
            if(board[i][0] == 'O' && vis[i][0] == false){
                dfs(i,0,board,vis);
            }
            if(board[i][n-1] == 'O' && vis[i][n-1] == false){
                dfs(i,n-1,board,vis);
            }
        }
        for(int j = 0;j<n;j++){
            if(board[0][j] == 'O' && vis[0][j] == false){
                dfs(0,j,board,vis);
            }
            if(board[m-1][j] == 'O' && vis[m-1][j] == false){
                dfs(m-1,j,board,vis);
            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(board[i][j] == 'O' && vis[i][j] == false){
                    board[i][j] = 'X';
                }
            }
        }
    }
    
    public void dfs(int i, int j, char[][] board, boolean[][] vis){
        int m = board.length;
        int n = board[0].length;
        if(i<0 || j<0 || i>=m || j>=n || vis[i][j] == true || board[i][j] == 'X'){
            return;
        }
        vis[i][j] = true;
        dfs(i+1,j,board,vis);
        dfs(i,j+1,board,vis);
        dfs(i-1,j,board,vis);
        dfs(i,j-1,board,vis);
    }
}