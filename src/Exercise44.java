import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {

//        44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//        Sample Output:
//
//        Input number: 5
//        5 + 55  + 555

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        Integer n = input.nextInt();
        Integer n1 = n;
        Integer n2 = Integer.valueOf(n1 + "" + n1);
        Integer n3 = Integer.valueOf(n1 + "" + n2);
        Integer sum = n1 + n2 + n3;

        System.out.println("Value of " + n1 + " + " + n2 + " + " + n3 + " is: " + sum);
    }
}
