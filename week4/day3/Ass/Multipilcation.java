//mutlplication matrix:
import java.util.Scanner;
class Multipilcation
  {
    public static void main(String []args)
    {
      int a[][]=new int[2][2];
      int b[][]=new int[2][2];
      int c[][]=new int[2][2];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first array elements:");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("enter the second array elements:");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              b[i][j]=sc.nextInt();
            }
        }
      System.out.println("multipilcation matrix:");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              c[i][j]=a[i][j]*b[i][j];
              System.out.print(c[i][j]+" ");
            }
          System.out.println();
        }
    }
  }