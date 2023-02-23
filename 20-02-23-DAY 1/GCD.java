//16. Write a Java Program to find GCD of two given numbers. 

import java.util.Scanner;

public class GCD{
	
public static void main(String[] args){
	
	int num1,num2,gcd=0;
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter a first no.: ");
	num1=reader.nextInt();
	System.out.println("Enter a second no.: ");
	num2=reader.nextInt();
	//gcd=i;
	
	for(int i=1;i<=num1||i<=num2;i++)
	{
		if(num1%i==0&&num2%i==0)
		gcd=i;
	}
	System.out.println("The gcd of given no. is "+gcd);
	}
	
}