package Java_150;

import java.util.Scanner;

public class Sum_Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number: ");
		int x=sc.nextInt();
		
		 int sum = 0;
	               
	        while (x != 0) {
	            sum += x % 10; 
	            x /= 10; 
	        }
	        
	       
	        System.out.println("Sum of digits: " + sum);

	}

}
