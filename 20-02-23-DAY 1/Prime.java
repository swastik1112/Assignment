//21. Write a Java Program to check whether the Given Number is Prime Number or NOT. 

import java.util.Scanner;

public class Prime{

  public static void main(String[] args) {

  //int num;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number: ");
  int num=sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
     
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}