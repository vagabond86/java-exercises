import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {

//        41. Write a Java program to print the ascii value of a given character.
//        Expected Output
//
//        The ASCII value of Z is :90

        Scanner input = new Scanner(System.in);
        System.out.print("Type any character: ");
        char c = input.next().charAt(0);
        int i = c;

        System.out.println("The ASCII value of "+"'"+ c +"'"+ " is : " + i);
    }
}
