import java.util.Scanner;
class EqualOf
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      String st="hello";
      String st1="hello";
      String st2="hai";
      String st3=new String("hello");
      String st4=new String("hai");
      System.out.println(st.equals(st1));
      System.out.println(st1.equals(st3));
      System.out.println(st2.equals(st4));
      System.out.println(st3.equals(st4));
    }
  }