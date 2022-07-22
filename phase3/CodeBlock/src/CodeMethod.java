public class CodeMethod {
    public static void main(String[] args) {

        int levelCompleted = 8;
        int bonus = 250;

        calculateScore(true, 2000, levelCompleted, bonus);

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
