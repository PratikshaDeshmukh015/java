package Java_150;
import java.util.Scanner;
public class Matrix_Anyrowclom_Size {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        int[][] matrix = new int[rows][cols];
	        int value = 1;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = value++;
	            }
	        }

	        System.out.println("Generated " + rows + "x" + cols + " matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }

	    }
	}
