import java.util.*;

class Permutation
{
    public static void main(String[] args)
    {
        int[] nums = {1, 4, 2};
        List<List<Integer>> finalList = permute(nums);
        System.out.println(finalList.toString());
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new LinkedList<>();
        int numsLengh = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numsLengh;i++)
            list.add(nums[i]);
        possiblePermutations(list, 0, numsLengh, finalList);
        return finalList;
    }
    public static void possiblePermutations(List<Integer> nums, int start, int end, List<List<Integer>> finalList)
    {
        if(start==end)
            finalList.add(new ArrayList<>(nums));
        else {
            for( int i = start; i<end; i++)
            {
                Collections.swap(nums,start, i);
                possiblePermutations(nums,start+1,end, finalList);
                Collections.swap(nums,start, i);
            }
        }
    }
}