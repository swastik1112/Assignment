//7.How to check the given number is Positive or Negativein Java? 

public class PosNeg{
	
	public static void main(String args[]){
	
		int number=45;
		
		if(number>0){
			System.out.println(number + " is positive");
		}
		else if(number<0){
			System.out.println(number + " is negative");
		}
		else {
			System.out.println(number +" is zero");
		}
	}
}