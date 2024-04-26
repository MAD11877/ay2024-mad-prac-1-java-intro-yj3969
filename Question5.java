import java.util.Scanner;
import java.util.Arrays;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    int count = in.nextInt();
    int[] numbers = new int[count];

    for (int i = 0; i < count; i++) {
        numbers[i] = in.nextInt();
    }
    
    Arrays.sort(numbers); 

    int mode = numbers[0]; 
    int maxCount = 1; 
    int currentCount = 1; 
    
    for (int i = 1; i < count; i++) {
        if (numbers[i] == numbers[i - 1]) {
            currentCount++; 
        } else {
            if (currentCount > maxCount) {
                maxCount = currentCount; 
                mode = numbers[i - 1]; 
            }
            currentCount = 1; 
        }
    }

    if (currentCount > maxCount) {
        mode = numbers[count - 1];
    }

    System.out.println(mode);
    
  }
}
