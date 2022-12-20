import java.util.Scanner;

public class Exercise033 {
    public static void main(String[] args) {

//        33. Write a Java program and compute the sum of the digits of an integer.
//        Input Data:
//        Input an integer: 25
//        Expected Output
//
//        The sum of the digits is: 7

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        Integer n = input.nextInt();
        Integer sum = 0;

        while (n != 0) {
            Integer remainder = n % 10;
            sum = sum + remainder;
            n = n / 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
