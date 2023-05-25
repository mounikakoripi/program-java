import java.util.Scanner;
class TwoDimensional
  {
    public static void twodimen(int a[][],int row,int col)
    {
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row size:");
      int row=sc.nextInt();
      System.out.println("enter the coloum size:");
      int col=sc.nextInt();
      int a[][]=new int[row][col];
      System.out.println("enter the elements:");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      twodimen(a,row,col);
    }
  }