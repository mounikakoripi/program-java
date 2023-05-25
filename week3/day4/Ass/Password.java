// Assignment 1: Password Validation
//Write a program that prompts the user to enter a password. 
//Use a loop to keep asking for the password until a correct one is entered. 
//Use the break statement to exit the loop when the correct password is provided. 
//Implement a menu that allows the user to continue or exit the program.//

import java.util.Scanner;
class Password
  {
    public static void main(String []args)
    {
      String validusername="mounika";
      String validpassword="Mouni12@";
      Scanner sc=new Scanner(System.in);
     System.out.println("enter the user name and password:");
      String username=sc.nextLine();
      String password=sc.nextLine();
      int count=0;
      while(count<=2)
        {
          if((!(validusername==username)) ||(!(validpassword==password)))
          {
            System.out.println("wrong password.try again");
            
          }
          else
          {
          System.out.println("now you are loged in");
            break;
          }
          count++;
        } 
      if(count>2)
      System.out.println("so many time use  wait 5 minitues");
        System.exit(0);
    }
  }