import java.util.Scanner;
class Switch
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      char ch;
      do
        {
        System.out.println("select the operators");
        System.out.println("+------>addition"+"\n"+ "- ----->subtraction"+"\n"+ "*----->multipication"+"\n"+ " / ---->divison");
          char c=sc.next().charAt(0);
          System.out.println("enter the a value");
          System.out.println("enter the b value");
          int a=sc.nextInt();
          int b=sc.nextInt();
          switch(c)
            {
              case '+':
                System.out.println("addition of the "+(a+b));
                break;
              case '-':
                System.out.println("subtraction of the"+(a-b));
                break;
              case '*':
                System.out.println("multipication of the:"+(a*b));
                break;
              case '/':
                System.out.println("divison of the :"+(a/b));
                break;
              default:
                System.out.println("invalid input");
           }
          System.out.println("do you want to continue:(y/n)");
          ch=sc.next().charAt(0);
    }
while(ch=='y'||ch=='Y');
    }
  }