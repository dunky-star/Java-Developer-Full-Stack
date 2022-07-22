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

        int highScorePosition = calculateHighScorePosition(5000);
        displayHighScorePosition("Duncan", highScorePosition);

        highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Xi Hongjie", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Anjana", highScorePosition);

        highScorePosition = calculateHighScorePosition(10);
        displayHighScorePosition("Manish pal", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 0;
            return finalScore;
        } else {
            return -1;
        }

    }
    public static void displayHighScorePosition (String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + "on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore > 1000){
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;

        } else if (playerScore > 100 && playerScore < 500) {
            return 3;

        }else{
            return 4;
        }
    }
}
