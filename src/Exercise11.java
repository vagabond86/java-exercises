import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

//        11. Write a Java program to print the area and perimeter of a circle.
//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586

        Scanner input = new Scanner(System.in);
        System.out.print("Input radius of a circle: ");
        Double radius = input.nextDouble();

        Double perimeter = 2 * Math.PI * radius;
        Double area = (Math.PI * radius * radius);

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);

    }
}
