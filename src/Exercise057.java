import java.util.Scanner;

public class Exercise057 {
    public static void main(String[] args) {

//        57. Write a Java program to accepts an integer and count the factors of the number.
//        Sample Output:
//
//        Input an integer: 25
//        3

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        Integer numb = input.nextInt();
        Integer count = 0;

        for (Integer i = 1; i <= numb; i++) {
            if (numb % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
