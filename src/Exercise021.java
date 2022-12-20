import java.util.Scanner;

public class Exercise021 {
    public static void main(String[] args) {

//        21. Write a Java program to convert a decimal number to octal number.
//        Input Data:
//        Input a Decimal Number: 15
//        Expected Output
//
//        Octal number is: 17

        Scanner input = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int decimal = input.nextInt();

        System.out.println("Octal number is: " + Integer.toOctalString(decimal));
    }
}
