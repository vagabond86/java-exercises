import java.util.Scanner;

public class Exercise028 {
    public static void main(String[] args) {

//        28. Write a Java program to convert a hexadecimal to a decimal number. Go to the editor
//        Input Data:
//        Input a hexadecimal number: 25
//        Expected Output
//
//        Equivalent decimal number is: 37

        Scanner input = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String h = input.next();

        System.out.println("Equivalent decimal number is: " + Integer.parseInt(h, 16));
    }
}
