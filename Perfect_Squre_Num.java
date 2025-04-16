package Java_150;
import java.util.Scanner;
public class Perfect_Squre_Num {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        boolean isPerfectSquare = false;

	        for (int i = 1; i * i <= number; i++) {
	            if (i * i == number) {
	                isPerfectSquare = true;
	                break;
	            }
	        }

	        if (isPerfectSquare) {
	            System.out.println(number + " is a perfect square.");
	        } else {
	            System.out.println(number + " is NOT a perfect square.");
	        }

	       
	    }
	}

