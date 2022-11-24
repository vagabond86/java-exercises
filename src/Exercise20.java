import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {

//        20. Write a Java program to convert a decimal number to hexadecimal number.
//        Input Data:
//        Input a decimal number: 15
//        Expected Output
//
//        Hexadecimal number is : F

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimal = input.nextInt();

        System.out.println("Hexadecimal number is: " + Integer.toHexString(decimal));
    }
}
