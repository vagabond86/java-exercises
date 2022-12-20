import java.util.Scanner;

public class Exercise032 {
    public static void main(String[] args) {

//        32. Write a Java program to compare two numbers
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//
//        25 != 39
//        25 < 39
//        25 <= 39

        Scanner input = new Scanner(System.in);
        System.out.print("Input two numbers to compare: \nfirst: ");
        Integer n1 = input.nextInt();
        System.out.print("second: ");
        Integer n2 = input.nextInt();

        if (n1 == n2)
            System.out.println(n1 + " = " + n2);
        if (n1 != n2)
            System.out.println(n1 + " != " + n2);
        if (n1 > n2)
            System.out.println(n1 + " > " + n2);
        if (n1 < n2)
            System.out.println(n1 + " < " + n2);
        if (n1 <= n2)
            System.out.println(n1 + " <= " + n2);
        if (n1 >= n2)
            System.out.println(n1 + " >= " + n2);
    }
}
