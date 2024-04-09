import java.util.ArrayList;
import java.util.List;

public class NQueensProblem {
    public static boolean isSafe(int row, int col, char[][] board){
        //horizontally
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == 'Q'){
                return false;
            }
        }

        //vertically
        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //upper left
        for (int i = row, j = col; i >=0 && j>=0 ; i--, j--) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //upper right
        for (int i = row, j = col; i >=0 && j<board.length ; i--, j++) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //lower left
        for (int i = row, j = col; i <board.length && j>=0 ; i++, j--) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //lower right
        for (int i = row, j = col; i <board.length && j<board.length ; i++, j++) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        List<String> newBoard = new ArrayList<>();
        StringBuilder row;
        for (int i = 0; i < board.length; i++) {
            row = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 'Q'){
                    row.append('Q');
                }
                else{
                    row.append('.');
                }
            }
            newBoard.add(row.toString());
        }
        allBoards.add(newBoard);
    }
    public static void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>> NQueensSolver(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);

        return allBoards;
    }
    public static void main(String[] args) {
        System.out.println(NQueensSolver(10));
    }
}
