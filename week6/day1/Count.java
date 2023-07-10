//Write a Java program that takes a sentence as input and counts 
//the number of occurrences of a specific word using StringBuffer.
import java.util.Scanner;
class Count
  {
    public static void main(String []args)
    {
     Scanner sc=new Scanner(System.in);
     // System.out.println("enter the string");
      StringBuffer sb=new StringBuffer("welcome to my home");
         int count=0;
    StringBuffer sb1;
      for(int i=0;i<sb.length();i++)
        {
           //sb1=sb.substring(0,18);
          if(sb.charAt(i)>0)
          {
          count++;
          }
        
      System.out.println("number of words in string:"+count);
        }
    }
  }