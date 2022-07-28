package OOP;

public class Hours_Minutes_Seconds {
    private static final String INVALID_MESSAGE_VALUE = "Invalid value";
    private static String getDuration( long minutes, long seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " +remainingMinutes + "m " + seconds + "s ";
    }
    private static String getDuration( long seconds){
        if (seconds < 0){
            return "Invalid value";
        }
        long minutes = seconds /60;
        long remainingSeconds = seconds % 60;
        return getDuration(minutes, remainingSeconds);
    }
    public static void main(String[] args){
        System.out.println("Duration is: " + getDuration(65, 50));
        System.out.println("Duration is: " + getDuration(10111));

    }
}
