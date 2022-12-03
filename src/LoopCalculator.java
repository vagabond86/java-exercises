import java.util.Scanner;

public class LoopCalculator {
    public static void main(String[] args) {

        Integer option;

        do {
            option = choseOption();
            switch (option) {
                case 1 -> calculateAverage();
                case 2 -> calculateProduct();
                case 3 -> circumference();
                case 4 -> square();
                case 0 -> endOfProgram();
                default -> System.out.println("Nie ma takiej opcji w programie");
            }
        } while (option != 0);
    }

    private static void endOfProgram() {
        System.out.println("Kończę program");
    }

    private static void square() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj długość boku kwadratu: ");
        Double a = input.nextDouble();
        Double square = a * a;

        if (a < 0) {
            System.out.println("Błąd");
        } else {

            System.out.println("Pole kwadratu wynosi: " + square);
            System.out.println();
        }
    }

    private static void circumference() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj promień koła: ");
        Double r = input.nextDouble();
        Double cirumference = 2 * Math.PI * r;

        if (r < 0) {
            System.out.println("Błąd");
        } else {

            System.out.println("Pole koła wynosi: " + cirumference);
            System.out.println();
        }
    }

    private static Integer choseOption() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz operację:");
        System.out.println("1 - średnia arytmetyczna");
        System.out.println("2 - iloczyn");
        System.out.println("3 - obwód koła");
        System.out.println("4 - pole kadratu");
        System.out.println("0 - opuść program");
        return input.nextInt();
    }

    private static void calculateAverage() {
        Scanner input = new Scanner(System.in);
        Double sum = 0.0;

        System.out.print("Z ilu liczb wyliczyć średnią? ");
        Integer numb = input.nextInt();

        if (numb <= 0) {
            System.out.println("Błąd");
        } else {
            System.out.println("Podaj " + numb + " liczb całkowitych: ");

            for (int i = 0; i < numb; i++) {
                sum = sum + input.nextInt();
            }
            System.out.println("Średnia wynosi: " + (sum / numb));
            System.out.println();
        }
    }

    private static void calculateProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź kolejne liczby do mnożenia.\nGdy podasz 0 dokonam obliczenia");

        Double number = input.nextDouble();
        Double product = 1.0;

        while (number != 0) {
            product *= number;
            number = input.nextDouble();
        }
        System.out.println("Iloczyn wynosi: " + product);
        System.out.println();
    }
}
