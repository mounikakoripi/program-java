//Q1. WAP to accept a string from the user and check the String length is greater than 3 characters and smaller than 15 characters.
 
//-> valid 
//-> not valid
import java.util.Scanner;
 class StringLength
   {
     public static void main(String []args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the string:");
       String s=sc.nextLine();
       StringBuffer sb=new StringBuffer();
       int length=sb.length();       
       if(length>=3 && length<=15)
       {
         System.out.println("your string is valid");
       }
       else{
         System.out.println("your string is not valid:");
       }
     }
   }