//23. Write a Java Program to check whether the given number is Armstrong Numberor NOT.
import java.util.Scanner;

public class Armstrong{

    public static void main(String[] args) {

        int number, temp, total = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}