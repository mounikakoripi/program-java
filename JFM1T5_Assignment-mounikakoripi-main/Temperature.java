/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{
public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number of the days:");
  int n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("enter the temperature of the day:");
  for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
      }
  int lowest=a[0];
  for(int i=0;i<a.length;i++)
    {
      if(lowest>a[i])
      {
        lowest=a[i];
      }
    }
  System.out.println("the lowest temperature of the week is:"+lowest);
}
  
//Define the main method

//Declare the variables and initialize

//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result

}