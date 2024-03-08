import java.util.ArrayList;
import java.util.List;

public class Subsets
{
    public static List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> finalList = new ArrayList<>();
        possibleSubsets(nums,0,finalList, new ArrayList<>());
        return finalList;
    }
    public static void possibleSubsets(int[] nums, int start, List<List<Integer>> finalList, List<Integer> list)
    {
        finalList.add(new ArrayList<>(list));
        for(int i = start; i<nums.length; i++)
        {
            list.add(nums[i]);
            possibleSubsets(nums,i+1,finalList,list);
            list.remove(list.size()-1);
        }
    }
}
