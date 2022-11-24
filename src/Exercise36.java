import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {

//        36. Write a Java program to compute the distance between two points on the surface of earth.
//        Distance between the two points [ (x1,y1) & (x2,y2)]
//        d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//        Radius of the earth r = 6371.01 Kilometers
//        Input Data:
//        Input the latitude of coordinate 1: 25
//        Input the longitude of coordinate 1: 35
//        Input the latitude of coordinate 2: 35.5
//        Input the longitude of coordinate 2: 25.5
//        Expected Output
//
//        The distance between those points is: 1480.0848451069087 km

        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate (x1): ");
        Double lat1 = input.nextDouble();
        Double x1 = Math.toRadians(lat1);
        System.out.print("Input the longitude of coordinate (y1): ");
        Double long1 = input.nextDouble();
        Double y1 = Math.toRadians(long1);
        System.out.print("Input the latitude of coordinate (x2): ");
        Double lat2 = input.nextDouble();
        Double x2 = Math.toRadians(lat2);
        System.out.print("Input the longitude of coordinate (y2): ");
        Double long2 = input.nextDouble();
        Double y2 = Math.toRadians(long2);

        Double r = 6371.01;
        Double d = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between those points is: " + d + " km");
    }
}
