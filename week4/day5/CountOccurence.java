//wap to count occurrences of a character in given string
import java.util.Scanner;
class CountOccurence
  {
    public static void main(final String []args)
    {
      final Scanner sc=new Scanner(System.in);
      System.out.println("enter the String:");
      final String str=sc.nextLine();
     // System.out.println("enter the character to the count");
    char ch=sc.next().charAt(0);
      int count=0;
      for(int i=0;i<=str.length()-1;i++)
        {
          count++;
        }
      System.out.println("the string count"+count);
    }
  }