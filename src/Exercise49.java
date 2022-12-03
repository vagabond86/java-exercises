import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {

//        49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
//        Sample Output:
//
//        Input a number: 20
//        1

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        Integer n = input.nextInt();

        if (n % 2 == 0) {
            System.out.println(1 + " - " + n + " - is even");
        } else {
            System.out.println(0 + " - " + n + " - is odd");
        }
    }
}
