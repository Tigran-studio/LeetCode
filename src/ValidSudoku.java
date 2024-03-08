import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set setRow = new HashSet();
            Set setColumn = new HashSet();
            for (int k = 0; k < board[i].length; k++) {
                if (!setRow.add(board[i][k]) && !(board[i][k] == ('.')))
                    return false;
                if (!setColumn.add(board[k][i]) && !(board[k][i] == ('.')))
                    return false;
            }
        }
        if (
                !(isThreeXThreeValid(board, 0, 3, 0, 3) &&
                        isThreeXThreeValid(board, 0, 3, 3, 6) &&
                        isThreeXThreeValid(board, 0, 3, 6, 9) &&
                        isThreeXThreeValid(board, 3, 6, 0, 3) &&
                        isThreeXThreeValid(board, 3, 6, 3, 6) &&
                        isThreeXThreeValid(board, 3, 6, 6, 9) &&
                        isThreeXThreeValid(board, 6, 9, 0, 3) &&
                        isThreeXThreeValid(board, 6, 9, 3, 6) &&
                        isThreeXThreeValid(board, 6, 9, 6, 9)))
            return false;
        else return true;
    }

    public static boolean isThreeXThreeValid(char[][] board, int firstRow, int lastRow, int firstColumn, int lastColumn) {
        Set setThreeXThree = new HashSet();
        for (int i = firstRow; i < lastRow; i++) {
            for (int k = firstColumn; k < lastColumn; k++) {
                if (!setThreeXThree.add(board[i][k]) && !(board[i][k] == ('.')))
                    return false;
            }
        }
        return true;
    }
}