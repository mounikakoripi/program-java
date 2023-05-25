import java.util.Scanner;
class RightRotation
  {
    public static void Right(int a[], int size, int number)
    {
      int temp=a[size-1];
    System.out.println("before right rotation array elements:");
      for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]+" ");
        }
      System.out.println();
          for(int i=0;i<number;i++)
            {
              temp=a[0];
              for(int j=a.length-1;j>0;j--)
                {
                  a[j]=a[j+1];
                }
              a[a.length-1]=temp;
              System.out.println("after performing right rotation by 1 postion: ");
             for(i=0;i<a.length;i++)
               {
                 System.out.println(a[i]+" ");
               }
          }
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array:");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the postion value how many you want shift:");
      int number=sc.nextInt();
       System.out.println("enter the array elements:");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      Right(a,size,number);
    }
  }