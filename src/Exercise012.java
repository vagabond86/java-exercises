import java.util.Scanner;

public class Exercise012 {
    public static void main(String[] args) {

//        12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        Scanner input = new Scanner(System.in);

        System.out.println("Input 3 numbers");
        Double num1 = input.nextDouble();
        Double num2 = input.nextDouble();
        Double num3 = input.nextDouble();

        Double average = (num1 + num2 + num3) / 3;

        System.out.println("Average of the numbers: " + num1 + ", " + num2 + ", " + num3 + " = " + average);
    }
}
