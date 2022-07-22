public class CodeMethod {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 0;
        int levelCompleted = 8;
        int bonus = 250;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("\nYour final score was: " + score);
        }
        calculateScore(true, 2000, levelCompleted, bonus);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("\nYour final score was: " + score);
        }

    }
}
