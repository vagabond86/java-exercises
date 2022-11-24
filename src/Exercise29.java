import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {

//        29. Write a Java program to convert a hexadecimal to a binary number.
//        Input Data:
//        Enter Hexadecimal Number : 37
//        Expected Output
//
//        Equivalent Binary Number is: 110111

        Scanner input = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String h = input.next();
        Integer b = Integer.parseInt(h, 16);

        System.out.println("Equivalent Binary Number is: " + Integer.toBinaryString(b));
    }
}
