package Java_150;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        

        int originalNum = num;
        int sum = 0;
        int digits = 0;
      
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
      
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }
       
        if (sum == originalNum) {
            System.out.println("this is an Armstrong Number.");
        } else {
            System.out.println("this is NOT an Armstrong Number.");
        }
    }
}
