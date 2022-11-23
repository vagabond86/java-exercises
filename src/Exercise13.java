import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

//        13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
//        Test Data:
//        Width = 5.6 Height = 8.5
//
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20

        Scanner input = new Scanner(System.in);
        System.out.print("Input the width of the rectangle: ");
        Double width = input.nextDouble();
        System.out.print("Input the height of the rectangle: ");
        Double height = input.nextDouble();

        Double area = width*height;
        Double perimeter = 2*(width+height);

        System.out.println();
        System.out.println("Area of the rectangle: \nlengh: " + width + "\nheigh: " + height + "\nis a: " + area);
        System.out.println();
        System.out.println("Perimeter of the rectangle: \nlengh: " + width + "\nheigh: " + height + "\nis a: " + perimeter);
    }
}
