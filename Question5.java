import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the number of integers: ");
    int numElements = in.nextInt();

    int[] elements = new int[numElements];
    for (int i = 0; i < numElements; i++) {
      System.out.print("Enter integer " + (i + 1) + ": ");
      elements[i] = in.nextInt();
    }


    System.out.println("The mode is: " + mode);
  }
}
