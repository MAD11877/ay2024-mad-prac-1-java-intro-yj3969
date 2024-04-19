import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // Prompt the user for the number of rows
    System.out.print("Enter the number of rows for the triangle: ");

    // Read the integer input
    int rows = in.nextInt();

    // Print the triangle
    for (int i = 1; i <= rows; i++) {
      // Print i asterisks for each row
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(); // Move to the next line after each row
    }
  }
}
