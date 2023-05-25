import java.util.Scanner;
class StartWith
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      String st="hello wlecome to";
      System.out.println(st.startsWith("he"));
      System.out.println(st.endsWith("to"));
    }
  }