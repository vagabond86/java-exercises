import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

//        6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        Integer num1 = input.nextInt();

        System.out.print("Input second number: ");
        Integer num2 = input.nextInt();

        Integer add = num1 + num2;
        Integer minus = num1 - num2;
        Integer multiply = num1 * num2;
        Integer divide = num1 / num2;
        Integer remainder = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + minus);
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + divide);
        System.out.println(num1 + " % " + num2 + " = " + remainder);


    }
}
