//4.Swap two numberswithout using third variable approach 1. 
import java.util.*;

class Swap1Aproch{

	public static void main(String args[]){
		
		System.out.println("Enter th evalue of x and y");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Before swapping number: "+x+" "+y);
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 
		System.out.println("After swapping:"+x+" "+y);
	}

}