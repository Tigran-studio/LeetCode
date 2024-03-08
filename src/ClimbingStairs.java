public class ClimbingStairs
{
    public static void main(String[] args) {
        System.out.println("Possible number to climbe the stairs is "+climbStairs(45));
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