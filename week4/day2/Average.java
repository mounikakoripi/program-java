import java.util.Scanner;
class Average
  {
    public static void Average(int a[],int size)
    {
      int sum=0,average=0;
      System.out.println("average array");
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
          average=sum/size;
        }
     // System.out.println(sum+" ");
      System.out.println("the array on the average is:"+average);
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array:");
      int size=sc.nextInt();
      System.out.println("enter the elements of array:");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      Average(a,size);
    }
  }