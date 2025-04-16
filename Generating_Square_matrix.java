package Java_150;
import java.util.Scanner;
public class Generating_Square_matrix {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the square matrix: ");
	        int n = sc.nextInt();

	        int[][] matrix = new int[n][n];
	        int value = 1;

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                matrix[i][j] = value++;
	            }
	        }

	        System.out.println("Generated " + n + "x" + n + " matrix:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }

	      
	    }
	}
