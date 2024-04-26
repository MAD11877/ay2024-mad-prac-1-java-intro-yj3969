import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the size of the triangle (number of rows): ");
    int rows = in.nextInt();

    for (int i = 1; i <= rows; i++) {
      // Inner loop 
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(); // move 2 next line
    }
  }
}
