import java.util.Random;
import java.util.Scanner;
class Game
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int guess=sc.nextInt();
      int ans=sc.nextInt();
     Random rand=new Random();
      boolean correct =false;
      System.out.println("random numbers 1 to 100");
      int n=sc.nextInt();
      while(!correct)
        {
          if(ans>guess)
          {
            System.out.println("too high ");
              
          }
          else if(ans<guess)
          {
            System.out.println("too low");
          }
        }
    }
  }