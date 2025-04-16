package Java_150;
import java.util.Scanner;
public class Pascals_triangle {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows for Pascal's Triangle: ");
	        int rows = sc.nextInt();

	        for (int i = 0; i < rows; i++) {
	            int number = 1;

	            for (int space = 0; space < rows - i; space++) {
	                System.out.print("  ");
	            }

	            for (int j = 0; j <= i; j++) {
	                System.out.print(number + "   ");
	                number = number * (i - j) / (j + 1);
	            }

	            System.out.println();
	        }

	     
	    }
	}
