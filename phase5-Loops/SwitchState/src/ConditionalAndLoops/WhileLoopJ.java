package ConditionalAndLoops;

public class WhileLoopJ {
    public static void main(String[] args){
        int count = 1;
        int sum = 0;
        while(count != 1001 ){
            sum += count;
            count++;       // For while loop, we have to increment count manually.
        }
        System.out.println("Sum of numbers from 1 to 1000 = " + sum);
    }
}
