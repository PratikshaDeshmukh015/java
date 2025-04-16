package Java_150;
import java.util.Scanner;
public class Odd_Num_Rang_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the staer number: ");
		int x=sc.nextInt();
		System.out.println("Enter the last number: ");
		int y=sc.nextInt();
		
		int sum=0;
		 if (x % 2 == 0) {
	            x++;
	        }

	        for (int i = x; i <= y; i += 2) {
	        	System.out.print(i + " "); 
	            sum += i;
		

	}
	        System.out.println("");
	        System.out.println("sum of odd number is: "+sum);

}
}
