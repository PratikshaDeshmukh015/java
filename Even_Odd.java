package Java_150;

import java.util.Scanner;
class Even_Odd{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("To cheack the given number is Even or Odd");
		int x=sc.nextInt();
		
		
		if(x % 2==0) {
			System.out.println("this number is even");
		}
		else {
			System.out.println("this number is odd");
		}
		
	}
}
