//2.Write a Java Program to find the Factorialof given number. 

import java.util.*;

class Facto{

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the no.");
	int num=sc.nextInt();
	int i=1,fact=1;
	while(i<=num)
	{
		fact=fact*i;
		i++;
		
	}
	System.out.println("Factorial of the number: "+fact);
	
}

}