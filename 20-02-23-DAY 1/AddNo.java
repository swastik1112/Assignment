//14. How to add two numbers without using the arithmetic operators in Java?

class AddNo{
	
	static int Sum(int a,int b){
		
		while(b!=0){
			
			int carry=a&b;
			a=a^b;
			b=carry<<1;
			
		}
		return a;
	}
	public static void main(String args[]){
		
		System.out.println(Sum(2,3));
	}
}