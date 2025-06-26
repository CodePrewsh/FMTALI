//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Main program loop
        do {
            // Get user input
            System.out.print("Enter your weight in kg: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter your height in meters: ");
            double height = scanner.nextDouble();

            // Calculate BMI
            double bmi = weight / (height * height);
            System.out.println("Your BMI is: " + bmi);

            // Determine BMI category
            if (bmi < 16.0) {
                System.out.println("Severely Underweight");
            } else if (bmi >= 16.0 && bmi <= 18.4) {
                System.out.println("Underweight");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("Normal");
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                System.out.println("Overweight");
            } else if (bmi >= 30.0 && bmi <= 34.9) {
                System.out.println("Moderately Obese");
            } else if (bmi >= 35.0 && bmi <= 39.9) {
                System.out.println("Severely Obese");
            } else {
                System.out.println("Morbidly Obese");
            }

        } while (askToRepeat(scanner) == 'Y' || askToRepeat(scanner) == 'y');

        scanner.close();
    }

    public static char askToRepeat(Scanner scanner) {
        while (true) {
            System.out.print("Do you want to calculate again? (Y/N): ");
            String input = scanner.next();
            char choice = input.charAt(0);

            if (choice == 'Y' || choice == 'y' || choice == 'N' || choice == 'n') {
                return choice;
            } else {
                System.out.println("Invalid input. Please enter Y/y or N/n.");
            }
        }
    }
}
