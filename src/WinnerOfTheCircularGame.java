public class WinnerOfTheCircularGame
{
    public static int findTheWinner(int n, int k) {
        if(n==1)
            return 1;
        int winnerOfTheCircularGame = (findTheWinner(n-1, k)+k)%n;
        if(winnerOfTheCircularGame==0)
            return n;
        else
            return winnerOfTheCircularGame;
    }
}