import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {

//        27. Write a Java program to convert a octal number to a hexadecimal number.
//        Input Data:
//        Input a octal number : 100
//        Expected Output
//
//        Equivalent hexadecimal number: 40

        Scanner input = new Scanner(System.in);
        System.out.print("Input a octal number: ");
        String o = input.next();
        Integer h = Integer.parseInt(o, 8);

        System.out.println("Equivalent hexadecimal number: " + Integer.toHexString(h));
    }
}
