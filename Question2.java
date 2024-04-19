import java.util.Scanner;

public class Question2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your height in meters: ");
    double height = in.nextDouble();

    System.out.print("Enter your weight (Kg): ");
    double weight = in.nextDouble();

    double bmi = weight / (height * height);

    System.out.println("Your BMI is: " + bmi);

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

