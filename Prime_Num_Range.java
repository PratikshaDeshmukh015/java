package Java_150;

import java.util.Scanner;

public class Prime_Num_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lower = sc.nextInt();

        System.out.print("Enter the upper bound: ");
        int upper = sc.nextInt();

        if (lower > upper || upper < 2) {
            System.out.println("Invalid range! Enter a valid range where upper bound is at least 2.");
         
        }

        System.out.println("Prime numbers of that range:");

        for (int num = Math.max(2, lower); num <= upper; num++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

  
    }
}
