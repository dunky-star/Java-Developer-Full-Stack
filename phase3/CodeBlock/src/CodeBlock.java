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

    }
}
