import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise47 {
    public static void main(String[] args) {

//        47. Write a Java program to display the current date time in specific format. Go to the editor
//        Sample Output:
//
//        Now: 2022/11/25 10:01:29.702

        String format = "yyyy/MM/dd HH:mm:ss.S";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String date = sdf.format(new Date());

        System.out.println("Now: " + date);
    }
}
