package ConditionalAndLoops;

public class NumberIsPrime {
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i =2; i <= n/2; i++){
            if(i%2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
      System.out.println("The is: " +isPrime(5));
    }
}
