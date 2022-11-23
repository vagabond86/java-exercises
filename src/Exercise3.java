import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

//        3. Write a Java program to divide two numbers and print on the screen.
//        Test Data :
//        50/3
//        Expected Output :
//        16

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wartość pierwszej liczby: ");
        Double num1 = input.nextDouble();

        System.out.print("Podaj wartość drugiej liczby: ");
        Double num2 = input.nextDouble();

        Double div = num1 / num2;

        System.out.println();
        System.out.println("Wynik dzielenia wynosi: " + div);
    }
}
