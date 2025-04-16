package Java_150;
import java.util.Scanner;

public class Fibonacii_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position: ");
        int n = sc.nextInt();
        
      
        int a = 0, b = 1, c = 0;

        if (n == 0) {
            System.out.println("Fibonacci number at position 0 is: " + a);
        } 
        else if (n == 1) {
            System.out.println("Fibonacci number at position 1 is: " + b);
        } 
        else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Fibonacci number at position " + n + " is: " + c);
        }

      
    }
}

