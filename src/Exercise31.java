public class Exercise31 {
    public static void main(String[]args){

//        31. Write a Java program to check whether Java is installed on your computer.
//        Expected Output
//
////        Java Version: 1.8.0_71
////        Java Runtime Version: 1.8.0_71-b15
////        Java Home: /opt/jdk/jdk1.8.0_71/jre
////        Java Vendor: Oracle Corporation
////        Java Vendor URL: http://Java.oracle.com/
////        Java Class Path: .

        System.out.println("Java Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
    }
}
