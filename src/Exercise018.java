import java.util.Scanner;

public class Exercise018 {
    public static void main(String[] args) {

//        Write a Java program to multiply two binary numbers.
//        Input Data:
//        Input the first binary number: 10
//        Input the second binary number: 11
//        Expected Output
//
//        Product of two binary numbers: 110

        String b1;
        String b2;

        Scanner input = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        b1 = input.next();

        System.out.print("Input second binary number: ");
        b2 = input.next();

        Integer num1 = Integer.parseInt(b1, 2);
        Integer num2 = Integer.parseInt(b2, 2);
        int multiply = num1 * num2;
        String result = Integer.toBinaryString(multiply);

        System.out.println();
        System.out.println("The result of multiplying two binary numbers is: " + result);
    }
}
