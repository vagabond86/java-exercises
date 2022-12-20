import java.util.Scanner;

public class Exercise034 {
    public static void main(String[] args) {

//        34. Write a Java program to compute the area of a hexagon.
//        Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//        where s is the length of a side
//        Input Data:
//        Input the length of a side of the hexagon: 6
//        Expected Output
//
//        The area of the hexagon is: 93.53074360871938

        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        Double l = input.nextDouble();
        Double area = (6 * Math.pow(l,2) / (4 * Math.tan(Math.PI / 6)));

        System.out.println("The area of the hexagon is: " + area);
    }
}
