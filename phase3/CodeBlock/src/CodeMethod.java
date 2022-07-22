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
}
