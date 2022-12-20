import java.util.Scanner;

public class Exercise055 {
    public static void main(String[] args) {

//        55. Write a Java program to convert seconds to hour, minute and seconds.
//        Sample Output:
//        Input seconds: 86399
//        23:59:59

        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        Integer sec = input.nextInt();
        Integer hour = sec / 3600;
        Integer min = (sec % 3600) / 60;
        Integer remsec = min % 60;

        System.out.print(hour + ":" + min + ":" + remsec);
    }
}
