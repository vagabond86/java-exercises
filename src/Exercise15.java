public class Exercise15 {
    public static void main(String[] args) {

//        15. Write a Java program to swap two variables.

        int a = 6;
        int b = 10;
        int temp;

        System.out.println("Values of variables before swapping: " + a + ", " + b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("Values of variables after swapping: " + a + ", " + b);

    }
}
