//WAP to search all occurrences of a character in given string.
import java.util.Scanner;
class AllOccurence
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the characeter:");
      char ch=sc.next().charAt(0);
      int count=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==ch)
          {
           //  count++;
          System.out.println("find at position"+i);
          }

          count++;
        }
          System.out.println(count);
        }
    }
  