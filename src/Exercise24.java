import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {

//        24. Write a Java program to convert a binary number to a Octal number.
//        Input Data:
//        Input a Binary Number: 111
//        Expected Output
//
//        Octal number: 7

        Scanner input = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String b = input.next();
        Integer o = Integer.parseInt(b, 2);
        String octalnumb = Integer.toOctalString(o);

        System.out.println("Octal number is : " + octalnumb);
        System.out.println("2nd method: Octal number is : " + Integer.toOctalString(Integer.parseInt(b, 2)));
    }
}
