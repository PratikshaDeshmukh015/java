package Java_150;

import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("To cheak the given year is leap year or not");
		int year=sc.nextInt();
		
				if(year%400==0|| (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("this is leap year");
		}
		else {
			System.out.println(" this year is Not leap year");
		}

	}

}
