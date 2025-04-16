package Java_150;

import java.util.Scanner;

public class Largest_Smallest_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Handle the case when n is 0 or negative
        if (n <= 0) {
            System.out.println("Invalid input! Array must have at least one element.");
            sc.close();
            return;
        }

        // Initialize array
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Close scanner
        sc.close();

        // Initialize smallest and largest with the first element
        int smallest = arr[0];
        int largest = arr[0];

        // Loop to find smallest and largest
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Output results
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
