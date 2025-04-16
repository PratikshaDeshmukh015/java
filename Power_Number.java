package Java_150;
import java.util.Scanner;
public class Power_Number {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the base number: ");
	        double base = sc.nextDouble();

	        System.out.print("Enter the exponent: ");
	        int exponent = sc.nextInt();

	        double result = Math.pow(base, exponent);

	        System.out.println("power is: " + result);
	     
	    }
	}
