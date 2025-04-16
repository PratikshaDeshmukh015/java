package Java_150;
import java.util.Scanner;
public class Nth_triangular_num {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input N
	        System.out.print("Enter a number (N): ");
	        int n = scanner.nextInt();

	        // Calculate Nth triangular number
	        int triangularNumber = n * (n + 1) / 2;

	        // Output
	        System.out.println("The " + n + "th triangular number is: " + triangularNumber);

	        scanner.close();
	    }
	}
