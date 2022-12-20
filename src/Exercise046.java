import java.util.Date;

public class Exercise046 {
    public static void main(String[] args) {

//        46. Write a Java program to display the system time.
//        Sample Output:
//
//        Current Date time: Fri Nov 25 09:50:37 CET 2022

        Date now = new Date();
        System.out.format("Current Data time is: " + now);
    }
}
