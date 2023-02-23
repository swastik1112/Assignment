//17. Write a java program to LCM of TWO given number. 
import java.util.Scanner;

public class LCM{

public static void main(String args[]){
	
	int num1,num2,lcm=0;
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter a first no.: ");
	num1=reader.nextInt();
	System.out.println("Enter a second no.: ");
	num2=reader.nextInt();
	
	int max = (num1 > num2) ? num1 : num2;
	
    for (int i = max; i <= num1 * num2; i++)
      {
     if (i % num1 == 0 && i % num2 == 0)
        {
         lcm = i;
         break;
        }
      }
    System.out.println ("The LCM of two no.: " + lcm);
  }
}