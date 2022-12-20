import java.util.Scanner;

public class Exercise023 {
    public static void main(String[] args) {

//        23. Write a Java program to convert a binary number to hexadecimal number.
//        Input Data:
//        Input a Binary Number: 1101
//        Expected Output
//
//        HexaDecimal value: D

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String b = input.next();
        Integer hex = Integer.parseInt(b, 2);
        String hexadecimal = Integer.toHexString(hex);

        System.out.println("Hexadecimal value is: " + hexadecimal);
        System.out.println("2nd method: Hexadecimal value is: " + Integer.toHexString(Integer.parseInt(b, 2)));
    }
}
