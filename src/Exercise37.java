import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {

//        37. Write a Java program to reverse a string.
//        Input Data:
//        Input a string: The quick brown fox
//        Expected Output
//
//        Reverse string: xof nworb kciuq ehT

        Scanner input = new Scanner(System.in);
        System.out.print("Input a text: ");
        char[] letters = input.nextLine().toCharArray();

        System.out.print("Reverse text: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
