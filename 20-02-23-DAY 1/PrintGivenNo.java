//10. Write a Java Program to print the digits of a Given Number. 

public class PrintGivenNo{
	
	public static void main(String args[]){
	int n=364,mod;
	System.out.println("print the digits of a Given Number: ");
	while(n!=0)
	{
		mod=n%10;
		n=n/10;
		System.out.print(mod+ " ");
	}
	}
}