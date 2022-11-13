class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for(int i = 0; i < n; i++){
            for( int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        int lc[] = new int[n];Arrays.fill(lc,0);                     //For tracking the left coloumns ◀◀◀ of the chess.
                                                                     //                               ↖                 
        int ud[] = new int[(2 * n) - 1];Arrays.fill(ud,0);           //For tracking the upper diagonal  ↖
                                                                     //                                   ↖      
                                                                     //                              ↘ 
        int ld[] = new int[(2 * n) - 1];Arrays.fill(ld,0);           //For tracking the lower digonal  ↘
                                                                     //                                  ↘
        dfs(board, 0, n, lc, ud, ld);
        return res;
    }
    void dfs(char[][] board, int c, int n, int[] lc, int[] ud, int[] ld){
        if(c == n){
            res.add(construct(board));
            return;
        }
        for(int i = 0; i < n; i++){
            if((lc[i] == 0) && (ld[i + c] == 0) && (ud[n - 1 + c - i] == 0)){
                board[i][c] = 'Q';
                lc[i] = 1;
                ld[i + c] = 1;
                ud[n - 1 + c - i] = 1;
                dfs(board, c + 1, n, lc, ud, ld);
                board[i][c] = '.';
                lc[i] = 0;
                ld[i + c] = 0;
                ud[n - 1 + c - i] = 0;
            }
        }
    }

    List<String> construct(char[][] board){
       List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
