package bmicalculator;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Get user input
            System.out.print("Enter your weight in kg: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter your height in meters: ");
            double height = scanner.nextDouble();

            // Calculate BMI
            double bmi = weight / (height * height);
            System.out.println("Your BMI is: " + bmi);

            // Display BMI category
            if (bmi < 16.0) {
                System.out.println("Severely Underweight");
            } else if (bmi <= 18.4) {
                System.out.println("Underweight");
            } else if (bmi <= 24.9) {
                System.out.println("Normal");
            } else if (bmi <= 29.9) {
                System.out.println("Overweight");
            } else if (bmi <= 34.9) {
                System.out.println("Moderately Obese");
            } else if (bmi <= 39.9) {
                System.out.println("Severely Obese");
            } else {
                System.out.println("Morbidly Obese");
            }

            choice = askToRepeat(scanner);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thanks for using the BMI Calculator. Stay healthy!");
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
