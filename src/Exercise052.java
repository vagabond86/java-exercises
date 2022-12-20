import java.util.Scanner;

public class Exercise052 {
    public static void main(String[] args) {

//        52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
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
        System.out.print("Give your result: ");
        Integer n3 = input.nextInt();

        Integer sum = n1 + n2;
        Boolean result = n3 == sum;

        if (n3 == sum) {
            System.out.print(result + "- the result is: " + sum);

        } else {
            System.out.print(result + " - the result is: " + sum);

        }
    }
}
