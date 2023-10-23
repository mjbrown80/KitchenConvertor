import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Kitchen Measurement Convertor");

        System.out.println("Starting measurement type:\n Select and press enter\n (1) teaspoon (2) tablespoon\n " +
                "(3) cup      (4) ounce\n " +
                "(5) pint     (6) gallon");

        int userStartingMeasurement = scanner.nextInt();

        System.out.println("To measurement type:\n Select and press enter\n (1) teaspoon (2) tablespoon\n " +
                "(3) cup      (4) ounce\n " +
                "(5) pint     (6) gallon");

        int userEndingMeaurement = scanner.nextInt();

    }
}