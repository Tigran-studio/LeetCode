import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInAMatrix
{
    public List<Integer> luckyNumbers(int[][] matrix)
    {
        for (int[] row : matrix)
        {
            int minIndex = findMinIndex(row);
            if (row[minIndex] == findMaxNumOfColumn(matrix, minIndex))
                return List.of(row[minIndex]);
        }
        return new ArrayList<>();
    }
    private int findMinIndex(int[] row)
    {
        int minIndex = 0;
        for (int i = 0; i < row.length; i++)
            if (row[i] < row[minIndex])
                minIndex = i;
        return minIndex;
    }
    private int findMaxNumOfColumn(int[][] matrix, int index)
    {
        int template = 0;
        for (int i = 0; i < matrix.length; i++)
            template = Math.max(template, matrix[i][index]);
        return template;
    }
}