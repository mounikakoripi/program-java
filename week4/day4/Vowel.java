//WAP to count total number of vowels and consonants in a string.
import java.util.Scanner;
class Vowel
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string:");
      String str=sc.nextLine();
      int v=0;
      int c=0;
     for(int i=0;i<str.length();i++)
        {
  if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'))
  {
    v++;
  }
          else{
            c++;
          }
    
        }
      System.out.println("vowels are:"+v);
      System.out.println("constant are:"+c);
        }
  }
