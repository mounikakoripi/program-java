import java.util.Scanner;
class Tranpose
  {
    public static void main(String []args)
    {
      int a[][]=new int[2][2];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array element:");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("array matrix:");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              System.out.println(a[i][j]);
            }
        }
      System.out.println();
      System.out.println("transpose matrix");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              System.out.println(a[i][j]);
            }
        }
      System.out.println();
    }
  }