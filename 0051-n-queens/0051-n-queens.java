class Solution {
    public boolean isSafe(char[][] board, int row, int col, int n){
        //horizontal Check
        for(int i = 0; i < n; i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }

        //vertical check
        for(int j = 0; j < n; j++){
            if(board[j][col] == 'Q'){
                return false;
            }
        }

        //left Diagonal check
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //Right Diagonal check
        for(int i=row, j=col; i>=0 && j<n; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        
        return true;
    }

    public void NQueens(char[][] board, int row, int n, List<List<String>> Final_ans){
        if(row == n){
            List<String> solution = new ArrayList<>();
            for(char[] a : board){
                solution.add(new String(a));
            }
            Final_ans.add(solution);
            return;
        }

        for(int col=0; col<n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                NQueens(board, row+1, n, Final_ans);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
       List<List<String>> Final_ans = new ArrayList<>();
       char[][] board = new char[n][n];
   
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

       NQueens(board,0,n,Final_ans);
       return Final_ans;
    }
}