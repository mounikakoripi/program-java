import java.util.Scanner;
class Contain
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      String st1="hi";
      String st2="welcome";
      boolean value=st1.contains("a");
      System.out.println(st1.contains("i"));
      System.out.println(st2.contains("mel"));
      System.out.println(st2.contains("me"));
    }
  }