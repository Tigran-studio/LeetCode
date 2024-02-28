import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInAMatrix
{
    public static void main(String[] args)
    {
        int [][] matrix = { {7,8},
                {1,2}};
        System.out.println("Your lucky number is: "+luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int maxValueFromColumns = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            int minValueFromRow = 0;
            for (int k = 0; k < matrix[i].length; k++ )
            {
                Arrays.sort(matrix[i]);
                minValueFromRow = matrix[i][0];
            }
            if(maxValueFromColumns<minValueFromRow)
                maxValueFromColumns=minValueFromRow;
        }
        List<Integer> list = new ArrayList<>();
        list.add(maxValueFromColumns);
        return list;
    }
}