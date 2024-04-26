public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = in.nextDouble();

        System.out.print("Enter your weight in kilograms (e.g., 70): ");
        double weight = in.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi < 25) {
            bmiCategory = "Normal weight";
        } else if (bmi < 30) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obese";
        }

        System.out.println("BMI Category: " + bmiCategory);
    }
}
























** import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for height
        System.out.print("Enter your height in meters: ");
        double height = in.nextDouble();

        // Prompt user for weight
        System.out.print("Enter your weight in kilograms: ");
        double weight = in.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Print BMI result
        System.out.println("Your BMI is: " + bmi);
    }
}

