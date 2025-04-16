package Java_150;

import java.util.Scanner;
class Prime_Number {
public static void main(String[] args) {
	

    int y=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	
	 if(n<=1) {
		 System.out.println("This number is not prime");
		 
		 
	 }
	 else {
		 for(int i=2; i<n;i++) {
			 if(n%i==0) {			
				  y =1;
				 break;
				// return;
			 }
			
		 }
		 if(y==1) {
			System.out.println("This number is not prime ");
		 }
		 else {
			 System.out.println("This number is prime");
		
			
			
		}
		

}

}
}

