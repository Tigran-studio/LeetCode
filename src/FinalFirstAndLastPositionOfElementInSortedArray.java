public class FinalFirstAndLastPositionOfElementInSortedArray
{
    public static void main(String[] args)
    {
        int [] nums = {5,7,7,8,8,8,10};
        int target = 8;
        System.out.println("First and Last Position is: "+searchRange(nums, target));
    }
    public static int[] searchRange(int[] nums, int target) {
        int firstPosition = 0;
        int lastPosition = nums.length-1;

        while (firstPosition<=lastPosition)
        {
            int middlePosition = firstPosition+(lastPosition-firstPosition)/2;
            if(target<nums[middlePosition])
                lastPosition = middlePosition-1;
            else if(target>nums[middlePosition])
                firstPosition = middlePosition+1;
            else
            {
                int i;
                if(nums.length%2==0) {
                    i = --middlePosition;
                }else {
                    i =middlePosition;
                }
                while (nums[i]==target)
                    i++;
                int []arr ={middlePosition, i-1};
                return arr;
            }
        }
        int []ar = {-1,-1};
        return ar;
    }
}