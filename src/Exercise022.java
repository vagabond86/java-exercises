import java.util.Scanner;

public class Exercise022 {
    public static void main(String[] args) {

//        22. Write a Java program to convert a binary number to decimal number.
//        Input Data:
//        Input a binary number: 100
//        Expected Output
//
//        Decimal Number: 4

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String b = input.next();

        System.out.println("Decimal number is: " + Integer.parseInt(b, 2));
    }
}
