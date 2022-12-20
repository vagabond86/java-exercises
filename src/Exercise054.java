import java.util.Scanner;

public class Exercise054 {
    public static void main(String[] args) {

//        54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers) have the same rightmost digit.
//        The integers are non-negative.
//
//        Sample Output:
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        Integer a = input.nextInt();
        System.out.print("Input the second number: ");
        Integer b = input.nextInt();
        System.out.print("Input the third number: ");
        Integer c = input.nextInt();

        System.out.println("The result is: " + test(a, b, c, true));
    }

    private static boolean test(Integer a, Integer b, Integer c, boolean abc) {
        return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
    }
}
