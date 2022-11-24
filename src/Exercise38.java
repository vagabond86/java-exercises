import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {

//        38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
//        Expected Output
//
//        The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//        letter: 23
//        space: 9
//        number: 10
//        other: 6

        Scanner input = new Scanner(System.in);
        System.out.print("Input any characters (you can use letters, spaces, numbers and other characters): ");

        char[] chars = input.nextLine().toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                letter++;
            } else if (Character.isSpaceChar(chars[i])) {
                space++;
            } else if (Character.isDigit(chars[i])) {
                number++;
            } else {
                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}
