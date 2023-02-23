//15. Write a java program to Reverse a given number.

class ReverseNo{
	
	public static void main(String args[]){
		
		int no=123456,rev=0;
		while(no!=0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("The reverse of the given no. is: "+rev);
	}
}