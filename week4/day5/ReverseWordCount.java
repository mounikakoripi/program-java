import java.util.Scanner;
class ReverseWordCount
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string:");
      String str=sc.nextLine();
     String str1[]=str.split(" "); 
      String reverse=" ";
    int count=0;
    for(int i=str1.length-1;i>=0;i--)
      {
       
        reverse=reverse+str1[i];
        //count++;
      }
     count++;
      System.out.println("the string reverse is"+reverse);
      
 System.out.println("the string is reverse are:"+count);
      
    }
  }