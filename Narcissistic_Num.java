package Java_150;
import java.util.Scanner;
public class Narcissistic_Num {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (isNarcissistic(number)) {
	            System.out.println(number + " is a Narcissistic number.");
	        } else {
	            System.out.println(number + " is NOT a Narcissistic number.");
	        }
	    }

	    public static boolean isNarcissistic(int num) {
	        int originalNum = num;
	        int sum = 0;

	        int digits = String.valueOf(num).length();

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, digits);
	            num /= 10;
	        }

	        return sum == originalNum;
	    }
	}
