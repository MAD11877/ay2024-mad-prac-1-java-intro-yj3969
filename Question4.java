import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the number of rows for the triangle: ");

    int rows = in.nextInt();

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(); 
    }
  }
}
