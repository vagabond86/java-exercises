import java.util.Scanner;

public class Exercise25 {
    public static void main(String[]args){

//        25. Write a Java program to convert a octal number to a decimal number.
//        Input Data:
//        Input any octal number: 10
//        Expected Output
//
//        Equivalent decimal number: 8

        Scanner input = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String o = input.next();

        System.out.println("Equivalent decimal number: "+Integer.parseInt(o,8));
    }
}
