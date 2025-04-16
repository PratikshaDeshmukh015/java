
package Java_150;
import java.util.Arrays;
import java.util.Scanner;

public class Missing_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print("Numbers in ascending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Missing numbers in the sequence: ");
        boolean foundMissing = false;
        for (int i = numbers[0]; i < numbers[n - 1]; i++) {
            if (!contains(numbers, i)) {
                System.out.print(i + " ");
                foundMissing = true;
            }
        }

        if (!foundMissing) {
            System.out.print("None");
        }

     
    }

    public static boolean contains(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }
}
