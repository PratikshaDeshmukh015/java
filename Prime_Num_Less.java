package Java_150;
import java.util.Scanner;

public class Prime_Num_Less {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Prime numbers less than " + num + " are:");
        for (int i = 2; i < num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                   // break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    
    }
}
