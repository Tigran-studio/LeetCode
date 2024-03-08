import java.util.Arrays;

public class FinalFirstAndLastPositionOfElementInSortedArray
{
    public static int[] searchRange(int[] nums, int target)
    {
        int rangeStart = findRange(nums, target);
        if(rangeStart==nums.length || nums[rangeStart]!=target)
            return new int[]{-1,-1};
        int rangeEnd = findRange(nums, target+1)-1;
        return new int[]{rangeStart, rangeEnd};

    }
    public static int findRange(int[] nums, int target)
    {
        int rangeStart = 0;
        int rangeEnd = nums.length;
        while (rangeStart<rangeEnd)
        {
            int middle = (rangeStart + rangeEnd)/2;
            if(nums[middle]>=target)
                rangeEnd = middle;
            else
                rangeStart = middle + 1;
        }
        return rangeStart;
    }
}