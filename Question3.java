import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Prompt the user for an integer
    System.out.print("Enter an integer: ");

    // Read the integer input
    int number = in.nextInt();

    // Square the number
    int squaredNumber = number * number;

    // Print the result
    System.out.println("The square of " + number + " is: " + squaredNumber);
  }
}
