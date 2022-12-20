import java.util.Scanner;

public class Exercise056 {
    public static void main(String[] args) {

//        56. Write a Java program to find the number of values in a given range divisible by a given value.
//        For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
//        Sample Output:
//        5

        Scanner input = new Scanner(System.in);
        System.out.println("Input a range of numbers X to Y");
        System.out.print("X: ");
        Integer x = input.nextInt();
        System.out.print("Y: ");
        Integer y = input.nextInt();
        System.out.println("Input a number to see how many numbers are divisible in a given range");
        System.out.print("P: ");
        Integer p = input.nextInt();

        Integer count = 0;

        for (Integer i = x; i <= y; i++) {
            if (i % p == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
