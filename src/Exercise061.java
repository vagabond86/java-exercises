import java.util.Scanner;

public class Exercise061 {
    public static void main(String[] args) {

//        61. Write a Java program to reverse a word.
//        Sample Output:
//
//        Input a word: dsaf
//        Reverse word: fasd

        Scanner input = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = input.nextLine();

        String reverse = new StringBuilder(word).reverse().toString();

        System.out.println(reverse);


    }
}
