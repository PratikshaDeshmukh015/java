package Java_150;
import java.util.Scanner;
public class Sum_Digit_Squares {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int sum = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            sum += digit * digit;
	            number /= 10;
	        }

	        System.out.println("Sum of squares of digits: " + sum);

	    }
	}
