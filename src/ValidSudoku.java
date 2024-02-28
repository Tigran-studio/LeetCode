import java.util.*;

public class ValidSudoku
{
    public static void main(String[] args)
    {
        String[][] matrix = {
                {"8","3",".",".","7",".",".",".","."},
                {"6",".",".","1","9","5",".",".","."},
                {".","9","8",".",".",".",".","6","."},
                {"8",".",".",".","6",".",".",".","3"},
                {"4",".",".","8",".","3",".",".","1"},
                {"7",".",".",".","2",".",".",".","6"},
                {".","6",".",".",".",".","2","8","."},
                {".",".",".","4","1","9",".",".","5"},
                {".",".",".",".","8",".",".","7","9"}
        };
        printMatrix(matrix);
        System.out.println(matrix[3][0]);
        System.out.println("Your Sudoku is Valid: "+isValidSudoku(matrix));
    }
    public static boolean isValidSudoku(String[][] matrix)
    {
        for(int i = 0; i< matrix.length; i++)
        {
            Set setRow = new HashSet();
            Set setColumn = new HashSet();
            for(int k = 0; k< matrix[i].length; k++)
            {
                if(!setRow.add(matrix[i][k])&&!matrix[i][k].equals("."))
                    return false;
                if(!setColumn.add(matrix[k][i])&&!matrix[k][i].equals("."))
                    return false;
            }
        }
        if(
                !(isThreeXThreeValid(matrix, 0,3,0,3)&&
                        isThreeXThreeValid(matrix, 0,3, 3,6)&&
                        isThreeXThreeValid(matrix, 0,3,6,9)&&
                        isThreeXThreeValid(matrix,3,6,0,3)&&
                        isThreeXThreeValid(matrix,3,6,3,6)&&
                        isThreeXThreeValid(matrix,3,6,6,9)&&
                        isThreeXThreeValid(matrix,6,9,0,3)&&
                        isThreeXThreeValid(matrix,6,9,3,6)&&
                        isThreeXThreeValid(matrix,6,9,6,9)))
            return false;
        else return true;
    }
    public static void printMatrix(String[][]matrix)
    {
        for(int i = 0; i<matrix.length; i++)
        {
            for(int k = 0; k < matrix[i].length; k++)
            {
                System.out.print(matrix[i][k]+"   ");
            }
            System.out.println();
        }
    }
    public static boolean isThreeXThreeValid(String[][] matrix, int firstRow, int lastRow, int firstColumn, int lastColumn)
    {
        Set setThreeXThree = new HashSet();
        for(int i = firstRow; i< lastRow; i++)
        {
            for(int k = firstColumn; k<lastColumn; k++)
            {
                if(!setThreeXThree.add(matrix[i][k])&&!matrix[i][k].equals("."))
                    return false;
            }
        }
        return true;
    }
}