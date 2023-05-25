//WAP to count total number of words in a string.
import java.util.Scanner;
class TotalNumWords
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
         int count=0;
      System.out.println("enter the string");
      String str=sc.nextLine();
       String str1[]=str.split(" ");
    for(int i=0;i<str1.length;i++)
      {
        count++;
        //System.out.print(str[i]);
      }
       System.out.print(count);
      
    }
  }