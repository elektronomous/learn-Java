public class ShowCurrentTime {
    public static void main(String[] args) {
        // obtain the total milliseconds since midnight, 1, 1970
        long totalMilliSeconds = System.currentTimeMillis();
        
        // obtain the total seconds since midnight, 1, 1970
        long totalSeconds = totalMilliSeconds / 1000;

        // compute the current second in the minute in the hour
        long currentSeconds = totalSeconds % 60;

        // obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // compute the current minutes in the hour
        long currentMinutes = totalMinutes % 60;

        // obtain the total hours
        long totalHours = totalMinutes / 60;

        // compute the current hour
        long currentHours = totalHours % 60;

        System.out.println("Current time is " +
                           currentHours + ":" +
                           currentMinutes + ":" +
                           currentSeconds + ":");
    }
}