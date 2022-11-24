import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {

//        30. Write a Java program to convert a hexadecimal to a octal number.
//        Input Data:
//        Input a hexadecimal number: 40
//        Expected Output
//
//        Equivalent of octal number is: 100

        Scanner input = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String h = input.next();
        Integer o = Integer.parseInt(h, 16);

        System.out.println("Equivalent of octal number is: " + Integer.toOctalString(o));
    }
}
