package Java_150;
import java.util.Scanner;

public class Even_Num_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        scanner.close();

        int sum = 0;

        if (start % 2 != 0) {
            start++;
        }

        for (int i = start; i <= end; i += 2) {
        	System.out.print(i + " "); 
            sum += i;
        }
        System.out.println(" ");
        System.out.println("Sum of even numbers in the range: " + sum);
    }
   
}
