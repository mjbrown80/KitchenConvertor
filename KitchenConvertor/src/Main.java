import java.nio.file.attribute.UserPrincipal;
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

        System.out.println("PLease enter value:");

        int userValue = scanner.nextInt();

        double convertValue = convertMeasurement(userStartingMeasurement, userEndingMeaurement, userValue);

        System.out.println(userValue + " " + getMeasurementType(userStartingMeasurement) + " = " + convertValue + " " + getMeasurementType(userEndingMeaurement));
    }
    public static double convertMeasurement(int from, int to, double value){
        if (from == 1 && to ==2){
            return value / 3.0;
        }
        return value;
    }

    public static String getMeasurementType(int measurement){
        switch (measurement){
            case 1:
                return "teaspoon";
            case 2:
                return "tablespoon";
            case 3:
                return "cup";
            case 4:
                return "ounces";
            case 5:
                return "pint";
            case 6:
                return "gallon";
        }
        return "unknown";
    }

}