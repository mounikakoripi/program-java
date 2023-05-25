//WAP to find length of a string and compare and concatenate two strings.
import java.util.Scanner;
class Sample1
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      String st="welcome to bitlabs";
      String st1="good";
      String st2=new String("good");
      String st3="good";
    int  str=st.length();
      String str2=st.concat(st2);
      System.out.println(st.length());
      System.out.println(st1==st2);
      System.out.println(st1==st3);
      System.out.println(str2);
      System.out.println(st.equals(st2));
      System.out.println(st1.equals(st3));
      
    }
  }