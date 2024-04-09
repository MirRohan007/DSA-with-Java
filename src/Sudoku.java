import java.util.Arrays;

public class Sudoku {
    public static boolean isSafe(int row, int col, char[][] board, int number){
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == (char) (number + '0')){
                return false;
            }
        }
        for (char[] chars : board) {
            if (chars[col] == (char) (number + '0')) {
                return false;
            }
        }

        int srcRow = (row/3) * 3;
        int srcColumn = (col/3) * 3;

        for (int i = srcRow; i < srcRow + 3; i++) {
            for (int j = srcColumn; j < srcColumn + 3; j++) {
                if(board[i][j] == (char) (number + '0')){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean helper(int row, int col, char[][] board){
        if(row == board.length){
            return true;
        }

        int currentRow;
        int currentColumn;
        if(col == board.length - 1){
            currentRow = row + 1;
            currentColumn = 0;
        }
        else{
            currentRow = row;
            currentColumn = col + 1;
        }

        if(board[row][col] != '.'){
            return helper(currentRow, currentColumn, board);
        }
        else{
            for (int i = 0; i < board.length; i++) {
                if(isSafe(row, col, board, i)){
                    board[row][col] = (char) (i + '0');
                    if (helper(currentRow, currentColumn, board)) {
                        return true;
                    }
                    else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        if(helper(0, 0, board)){
            System.out.println(Arrays.deepToString(board));
        }
    }
}
