import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueNewConversion = true;

        while (continueNewConversion) {
            System.out.print("\u001B[35m");
            System.out.print("\u001B[4m");
            System.out.println("Welcome to the Kitchen Measurement Convertor");
            System.out.print("\u001B[0m");


            System.out.println("Starting measurement type:\n Select and press enter\n " +
                    "(1) teaspoon (2) tablespoon\n " +
                    "(3) cup      (4) ounce\n " +
                    "(5) pint     (6) gallon");

            int userStartingMeasurement = scanner.nextInt();

            System.out.println("To measurement type:\n Select and press enter\n " +
                    "(1) teaspoon (2) tablespoon\n " +
                    "(3) cup      (4) ounce\n " +
                    "(5) pint     (6) gallon");

            int userEndingMeaurement = scanner.nextInt();

            System.out.println("PLease enter value:");

            int userValue = scanner.nextInt();

            double convertValue = convertMeasurement(userStartingMeasurement, userEndingMeaurement, userValue);

            System.out.println(userValue + " " + getMeasurementType(userStartingMeasurement) + " = " + String.format("%.2f",convertValue) + " " + getMeasurementType(userEndingMeaurement));

        System.out.println("Would you like to convert another measurement? (1) yes or (2) no");
        int choice = scanner.nextInt();

        if (choice == 2){
            continueNewConversion = false;
        }
        System.out.println("Thank you for using the Kitchen convertor.");

        }
    }

        public static double convertMeasurement ( int from, int to, double value){
            if (from == 1 && to == 2) {
                return value / 3;
            }
            if (from == 2 && to == 1) {
                return value * 3;
            }
            if(from == 1 && to == 3){
                return value / 48;
            }
            if (from == 3 && to == 1){
                return value * 48;
            }
            if (from == 1 && to == 4){
                return value / 6;
            }
            if (from == 4 && to == 1){
                return value * 6;
            }
            if (from == 1 && to == 5){
                return value / 96;
            }
            if (from == 5 && to == 1){
                return value * 96;
            }
            if (from == 1 && to == 6){
                return value / 768;
            }
            if (from == 6 && to == 1){
                return value * 768;
            }
            if (from == 2 && to == 3) {
                return value / 16.231;
            }
            if(from == 3 && to == 2){
                return value * 16.231;
            }
            if (from == 2 && to == 4){
                return value / 2;
            }
            if (from == 4 && to == 2){
                return value * 2;
            }
            if (from == 2 && to == 5){
                return value / 32;
            }
            if (from == 5 && to == 2){
                return value * 32;
            }
            if (from == 3 && to == 4){
                return value / 8.115;
            }
            if (from == 4 && to == 3){
                return value * 8.115;
            }
            if (from == 3 && to == 5) {
                return value / 1.972;
            }
            if(from == 5 && to == 3){
                return value * 1.972;
            }
            if (from == 3 && to == 6){
                return value / 15.772;
            }
            if (from == 6 && to == 3){
                return value * 15.772;
            }



            return value;
        }

        public static String getMeasurementType ( int measurement){
            switch (measurement) {
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