/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;
public class SumWithoutPlus {
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number:");
  int a=sc.nextInt();
    System.out.println("enter the second number:");
   int b=sc.nextInt();
    int n=add(a,b);
    System.out.println(n);
  }
public  static int add(int a,int b)
  {
    for(int i=1;i<=b;i++)
    a++;
     return a;
  }
//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//check if the second number is greater than zero then increase first number and decrease second number

//check if the second number is less than zero then decrease first number and increase second number

//print result

}