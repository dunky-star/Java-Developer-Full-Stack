package ConditionalStatements;

public class DaysOfTheWeek {
    public static void main(String[] args){
        printDaysOfWeek(0);
        printDaysOfWeek(1);
        printDaysOfWeek(2);
        printDaysOfWeek(3);
        printDaysOfWeek(4);
        printDaysOfWeek(5);
        printDaysOfWeek(6);
        printDaysOfWeek(10);

    }
    private static void printDaysOfWeek(int day){
        switch(day){
            case 0:
                System.out.println("It's Sunday");
                break;
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            default:
                System.out.println("It's invalid value");
                break;
        }
    }
}
