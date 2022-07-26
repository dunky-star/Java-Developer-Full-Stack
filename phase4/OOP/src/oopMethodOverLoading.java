/**
 * Method overloading in Java.
 * Basically, using same method name but different number of parameters.
 */
public class oopMethodOverLoading {
    public static int caclculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000; // 1000 is an arbitrary number.
    }
    public static void main(String[] args){
     int newScore =   caclculateScore("Duncan", 200);
     System.out.println("New score is: " +newScore);
    }
}
