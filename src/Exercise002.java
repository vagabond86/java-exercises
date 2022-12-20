import java.util.Scanner;

public class Exercise002 {
    public static void main(String[] args) {

//        2. Write a Java program to print the sum of two numbers.
//        Test Data:
//        74 + 36
//        Expected Output :
//        110

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        Double num1 = input.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        Double num2 = input.nextDouble();

        Double sum = num1 + num2;

        System.out.println();
        System.out.println("Suma podanych liczb wynosi: " + sum);
    }
}
