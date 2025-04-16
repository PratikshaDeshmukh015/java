package Java_150;

import java.util.Scanner;

public class Armstrong_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lower = sc.nextInt();

        System.out.print("Enter the upper bound: ");
        int upper = sc.nextInt();

        if (lower > upper) {
            System.out.println("Invalid range! Lower bound should be less than or equal to the upper bound.");
            sc.close();
            return;
        }

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        for (int num = lower; num <= upper; num++) {
            int originalNum = num, sum = 0, digits = 0;

            int temp = originalNum;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            while (temp > 0) {
                int lastDigit = temp % 10;
                int power = 1;

                for (int i = 0; i < digits; i++) {
                    power *= lastDigit;
                }

                sum += power;
                temp /= 10;
            }

            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }

    }
}
