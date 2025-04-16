package Java_150;

import java.util.Scanner;
public class NumberSum_UntilDigit_Sum {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        while (number >= 10) {
	            number = sumOfDigits(number);
	        }

	        System.out.println("Single digit sum is: " + number);


	    }

	    public static int sumOfDigits(int num) {
	        int sum = 0;
	        while (num != 0) {
	            sum += num % 10;
	            num /= 10;
	        }
	        return sum;
	    }
	}

