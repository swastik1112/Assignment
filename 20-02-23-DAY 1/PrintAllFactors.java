//11.Write a Java Program to print all the Factors of the Given number.

import java.util.*;

public class PrintAllFactors{
	
	public static void main(String args[]){
	
	int N;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an Integer");
	N=sc.nextInt();
	System.out.println("Factors of given no. "+N);
	
	for(int i=1; i<=N; ++i){
		if(N%i==0){
			System.out.print(i+" ");
		}
	}
	
	}
}