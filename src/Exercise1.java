import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

//        1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//        Expected Output :
//        Hello
//        Alexandra Abramov

        Scanner input = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String firstName = input.next();

        System.out.print("Podaj swoje nazwisko: ");
        String lastName = input.next();

        System.out.println();
        System.out.println("Cześć!\n" + firstName + " " + lastName);
    }
}
