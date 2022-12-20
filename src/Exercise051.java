import java.util.Scanner;

public class Exercise051 {
    public static void main(String[] args) {

//        51. Write a Java program to convert a string to an integer in Java.
//
//        Input a number(string): 25
//        The integer value is: 25

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number (string): ");
        String numb = input.next();
        Integer result = Integer.parseInt(numb);

        System.out.println("The integer value is: " + result);
    }
}
