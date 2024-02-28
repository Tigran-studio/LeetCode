public class ClimbingStairs
{
    public static void main(String[] args)
    {
        System.out.println("The number of distinct ways is: "+climbStairs(44));
    }
    public static int climbStairs(int numberOfStairs)
    {
        if(numberOfStairs==1)
            return 1;
        if(numberOfStairs==2)
            return 2;
        return climbStairs(numberOfStairs-1)+climbStairs(
                numberOfStairs-2);
    }
}