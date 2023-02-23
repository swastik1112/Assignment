//12. Write a Java Program to find sum of the digits of a given number.

import java.util.*;

public class DigitSum{

public static void main(String args[])
{
	int m,n,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the number: ");
	m=s.nextInt();
	while(m>0)
	{
		n=m%10;
		sum=sum+n;
		m=m/10;
	}
	System.out.println("Sum of Disgit: "+sum);
}

}