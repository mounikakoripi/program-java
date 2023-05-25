import java.util.Scanner;
class ColRowSum
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int a[][]={{1,2,3},{2,3,4},{3,4,5}};
      for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
            {
              System.out.print(a[i][j]+"   ");
            }
        }
      System.out.println();
      for(int i=0;i<3;i++)
        {
          int sum=0;
          for(int j=0;j<3;j++)
            {
              sum=sum+a[i][j];
            }
          System.out.println("sum of row "+(i+1)+"is:"+sum);
        }
      System.out.println();
      for(int i=0;i<3;i++)
        { 
          int sum=0;
          for(int j=0;j<3;j++)
            {
              sum=sum+a[j][i];
              }
          System.out.println("sum of col "+(i+1)+"is:"+sum);
        }
      System.out.println();
    }
    
  }