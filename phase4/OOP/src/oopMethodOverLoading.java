/**
 * Method overloading in Java.
 */
public class oopMethodOverLoading {
    public static int caclculateScore(String playerName, int score){
        System.out.println("Player " + playerName + "scored " + score);
        return score * 1000;
    }
    public static void main(String[] args){
        caclculateScore("Duncan", 200);
    }
}
