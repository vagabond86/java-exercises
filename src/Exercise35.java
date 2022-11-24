import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {

//        35. Write a Java program to compute the area of a polygon.
//        Area of a polygon = (n*s^2)/(4*tan(π/n))
//        where n is n-sided polygon and s is the length of a side
//        Input Data:
//        Input the number of sides on the polygon: 7
//        Input the length of one of the sides: 6
//        Expected Output
//
//        The area is: 130.82084798405722

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        Integer nsides = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        Double lengh = input.nextDouble();
        Double area = (nsides * Math.pow(lengh, 2) / (4 * Math.tan(Math.PI / nsides)));

        System.out.println("The area is: " + area);
    }
}
