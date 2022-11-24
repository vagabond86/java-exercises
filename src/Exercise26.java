import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {

//        26. Write a Java program to convert a octal number to a binary number.
//        Input Data:
//        Input any octal number: 7
//        Expected Output
//
//        Equivalent binary number: 111

        Scanner input = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String o = input.next();
        int d = Integer.parseInt(o, 8);

        System.out.println("Equivalent binary number: " + Integer.toBinaryString(d));
    }
}
