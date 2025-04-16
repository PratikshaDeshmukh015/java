package Java_150;

import java.util.Scanner;

public class Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Array must have at least one element.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; 
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
