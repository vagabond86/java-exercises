import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {

//        17. Write a Java program to add two binary numbers. Go to the editor
//        Input Data:
//        Input first binary number: 10
//        Input second binary number: 11
//        Expected Output
//
//        Sum of two binary numbers: 101

        String b1;
        String b2;

        Scanner intput = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        b1 = intput.next();

        System.out.print("Input second binary number: ");
        b2 = intput.next();

        Integer num1 = Integer.parseInt(b1, 2);
        Integer num2 = Integer.parseInt(b2, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);

        System.out.println();
        System.out.println("Sum of two binary numbers: " + result);

    }
}
