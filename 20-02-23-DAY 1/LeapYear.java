//8.Write a Java Program to find whether given number is Leap year or NOT? 

import java.util.Scanner;

public class LeapYear{
	
	public static void main(String args[]){
		
		int year;
		System.out.println("Enter an year");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		
			System.out.println("Specified year is leap year");
		else 
			System.out.println("Specified year is not a leap year");
	}
}