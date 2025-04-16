package Java_150;
import java.util.Scanner;
public class Greatest_Common_divisor {

	
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int gcd = findGCD(num1, num2);
        System.out.println("Greatest Common Divisor (GCD) is: " + gcd);
        
        
    }
}
