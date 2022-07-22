public class CodeBlock {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("\nYour final score was: " + score);
        }

        boolean newGameOver = true;
        int newScore = 20000;
        int newLevelCompleted = 8;
        int newBonus = 250;
        if (newGameOver){
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("\nYour final score was: " + newScore);
        }


    }
}
