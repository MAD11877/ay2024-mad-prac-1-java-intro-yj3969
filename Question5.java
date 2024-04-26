import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for the number of integers
        System.out.print("Enter the number of integers: ");
        int numElements = in.nextInt();

        // Array to store the integers
        int[] data = new int[numElements];

        // Get user input for each integer
        System.out.println("Enter " + numElements + " integers:");
        for (int i = 0; i < numElements; i++) {
            data[i] = in.nextInt();
        }

        // Find the mode using a frequency table
        int mode = findMode(data);

        // Print the mode (if any)
        if (mode != -1) {
            System.out.println("The mode (highest occurrence) is: " + mode);
        } else {
            System.out.println("There is no unique mode (multiple elements have the highest occurrence).");
        }
    }

    // Function to find the mode (highest occurrence) in an array
    public static int findMode(int[] arr) {
        int maxCount = 0;
        int mode = -1; // Initialize to -1 to indicate no unique mode

        // Create a frequency table to store counts for each integer
        int[] frequencyTable = new int[arr.length];
        for (int num : arr) {
            frequencyTable[num]++; // Increment count for the current number
        }

        // Find the element with the highest count
        for (int i = 0; i < frequencyTable.length; i++) {
            if (frequencyTable[i] > maxCount) {
                maxCount = frequencyTable[i];
                mode = i;
            }
        }

        return mode;
    }
}
