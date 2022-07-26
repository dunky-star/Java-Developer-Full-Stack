/**
 * Method overloading in Java.
 * Basically, using the same method name but different number of parameters.
 */
public class oopMethodOverLoading {
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000; // 1000 is an arbitrary number.
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points." );
        return score * 1000; // 1000 is an arbitrary number.
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0; // 1000 is an arbitrary number.
    }
    public static void main(String[] args){
     int newScore =   calculateScore("Duncan", 200);
     System.out.println("New score is: " +newScore);
     calculateScore(600);
     calculateScore();
    }
}
