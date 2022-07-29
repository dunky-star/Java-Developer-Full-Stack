public class IfStatementBasic {
    public static void main (String[] args){
        // Using IF-ELSE statement.
        int value = 3;
        if ( value == 1){
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else{
            System.out.println("Value was not 1 or 2");
        }
        // Alternative approach is using switch-case statement
        int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("The value was 1");
                break;
            case 2:
                System.out.println("The value was 2");
                break;
            default:
                System.out.println("The value Was not 1 or 2");
                break;
        }
    }

}
