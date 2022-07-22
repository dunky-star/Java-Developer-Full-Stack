/*
  Written by: Geoffrey Duncan 0.
  Demonstrating method techniques and methods calls in Java.
 */
public class CodeMethod {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 8;
        int bonus = 250;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("\nYour final score was: " + highScore);

        highScore = calculateScore(true, 0, 8, 250);
        System.out.println("\nYour final score was: " + highScore);

        // Methods calls
        int highScorePosition = calculateHighScorePosition(5000); // Calculating player's score position.
        displayHighScorePosition("Duncan", highScorePosition);    // Displaying the player and the score position.

        highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Xi Hongjie", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Anjana", highScorePosition);

        highScorePosition = calculateHighScorePosition(10);
        displayHighScorePosition("Manish pal", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 0;
            return finalScore;
        } else {
            return -1;
        }

    }
    // Method to display high score position
    public static void displayHighScorePosition (String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");
    }
    // Method to calculate high score position
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;

        } else if (playerScore >= 100) {
            return 3;

        }else{
            return 4;
        }
    }
}
