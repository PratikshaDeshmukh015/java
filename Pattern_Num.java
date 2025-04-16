package Java_150;
import java.util.Scanner;
public class Pattern_Num {

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("How many rows you want");
	    	int row=sc.nextInt();
	    	
	        int num = 1;

	        for (int i = 1; i <= row; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }
	    }
	}

