package Day61;

/**
 * angle_between_hour_hand_and_minute_hand
 * sample Input 1:
 * 2
 * 6 30
 * 8 55
 * Sample Output 1:
 * 15
 * 62
 * Explanation For Sample Input 1:
 * For test case 1: when the time is 6:30 the two angles between the hour hand
 * and the minute hand is 15 degree and 345 degrees. As 15 is the smallest so
 * the ans is 15.
 * For test case 1: when the time is 8:55 the two angles between the hour hand
 * and the minute hand is 62.5 degree and 297.5 degrees. As 62.75 is the
 * smallest so the ans is 62.
 * Sample Input 2:
 * 2
 * 3 30
 * 12 0
 * Sample Output 2:
 * 75
 * 0
 * 
 */
public class angle_between_hour_hand_and_minute_hand {
    public static void main(String[] args) {
        int hour = 6;
        int minute = 30;
        int min_angle = (int) minute * 6;
        double hour_angle = (hour * 60 + minute) * 0.5;
        double angle = Math.abs(hour_angle - min_angle);
        angle = Math.min(360 - angle, angle);
        System.out.println((int) angle);
    }

}