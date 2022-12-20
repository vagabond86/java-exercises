import java.util.Scanner;

public class Exercise053 {
    public static void main(String[] args) {

//        53. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number.
//        If "abc" is true second number does not need to be greater than first number.
//
//        Sample Output:
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        Integer n1 = input.nextInt();
        System.out.print("Input the second number: ");
        Integer n2 = input.nextInt();
        System.out.print("Input the third number: ");
        Integer n3 = input.nextInt();

        boolean result;
        if (n2 > n1 && n3 > n2) {
            result = true;
            System.out.println("The result is: " + result);
        } else {
            result = false;
            System.out.println("The result is: " + result);
        }
    }
}
