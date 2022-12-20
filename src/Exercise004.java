public class Exercise004 {
    public static void main(String[] args) {

//        4. Write a Java program to print the result of the following operations.
//        Test Data:
//        a. -5 + 8 * 6
//        b. (55+9) % 9
//        c. 20 + -3*5 / 8
//        d. 5 + 15 / 3 * 2 - 8 % 3
//        Expected Output :
//        43
//        1
//        19
//        13

        Integer a = -5 + 8 * 6;
        System.out.println("-5 + 8 * 6 = " + a);

        Integer b = (55 + 9) % 9;
        System.out.println("(55 + 9) % 9 = " + b);

        Integer c = 20 + -3 * 5 / 8;
        System.out.println("20 + -3 * 5 / 8 = " + c);

        Integer d = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + d);

    }
}
