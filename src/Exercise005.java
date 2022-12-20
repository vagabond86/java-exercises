import java.util.Scanner;

public class Exercise005 {
    public static void main(String[] args) {

//        5. Write a Java program that takes two numbers as input and display the product of two numbers.
//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        Double num1 = input.nextDouble();

        System.out.print("Input second number: ");
        Double num2 = input.nextDouble();

        Double result = num1 * num2;

        System.out.println();
        System.out.println(num1 + " x " + num2 + " = " + result);
    }
}
