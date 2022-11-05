class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0) == board[i][j] && search(word,i,j,board,0))
                return true;
            }
        }
        return false;
    }
    private boolean search(String word,int i, int j, char[][] board,int count){
        if(count == word.length()) return true;
        if(i<0 || i>=board.length || j<0 ||j>=board[0].length || board[i][j]!=word.charAt(count)) return false;
        char temp = board[i][j];
        board[i][j] = '*';
        boolean found = search(word,i+1,j,board,count+1) || search(word,i,j+1,board,count+1) || search(word,i-1,j,board,count+1) || search(word,i,j-1,board,count+1);
        board[i][j] = temp;
        return found;
    }
}
