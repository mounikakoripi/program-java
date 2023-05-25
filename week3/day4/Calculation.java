import java.util.Scanner;
class Calculation
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      char ch;
      do{
        System.out.println("select the operators");
        System.out.println("+------>addition"+"\n"+ "- ----->subtraction"+"\n"+ "*----->multipication"+"\n"+ " / ---->divison");
        char c=sc.next().charAt(0);
        System.out.println("enter the values a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(c=='+')
        {
          System.out.println("result is addition"+(a+b));
          
        }
        else if(c=='-')
        {
          System.out.println("result is subtraction"+(a-b));
         }
        else if(c=='*')
        {
          System.out.println("result is multipilcation"+(a*b));
          }
        else if(c=='/')
        {
          System.out.println("result is divison"+(a/b));
        }
        else{
        System.out.println("invalid opertor");
        }
        System.out.println(" do you want  to continue:(y/n)");
      ch=sc.next().charAt(0);
        
      }
        while(ch=='y'||ch=='Y');
    }
  }