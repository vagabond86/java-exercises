import java.util.Scanner;

public class Exercise060 {
    public static void main(String[] args) {

//        60. Write a Java program to find the penultimate (next to last) word of a sentence.
//        Sample Output:
//
//        Input a String: The quick brown fox jumps over the lazy dog.
//        Penultimate word: lazy

        Scanner input = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        if (words.length >= 2) {
            System.out.println("Penultimate word: " + words[words.length - 2]);
        } else {
            System.out.println("It's not a sentence");
        }
    }
}
