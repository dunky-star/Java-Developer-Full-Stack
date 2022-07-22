public class CodeMethod {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 8;
        int bonus = 250;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore(true, 0, 8, 250);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 0;
            System.out.println("\nYour final score was: " + finalScore);
        }

    }
}
