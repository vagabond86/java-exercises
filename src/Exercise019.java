import java.util.Scanner;

public class Exercise019 {
    public static void main(String[] args) {

//        19. Write a Java program to convert a decimal number to binary number.
//        Input Data:
//        Input a Decimal Number : 5
//        Expected Output
//
//        Binary number is: 101

        Scanner input = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimal = input.nextInt();

        System.out.println("Binary number is: " + Integer.toBinaryString(decimal));
    }
}
