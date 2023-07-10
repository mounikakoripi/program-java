import java.util.Scanner;
class Pali
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
     System.out.println("enter the string :");
      //String st=sc.nextLine();
      StringBuffer sb=new StringBuffer();
      sb.reverse();
      String reverse=sb.toString();
      if(st.equals(reverse))
      {
        System.out.println("the string is palindrome");
      }
      else{
        System.out.println("the string is not palindrome");
      }
    }
  }