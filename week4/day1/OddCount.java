import java.util.Scanner;
class OddCount
  {
    public static void Count(int a[])
    {
    int count=0;
      System.out.println("count of odd numbers:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
            count++;
          }
        }
          System.out.println(count+" ");
        }
        public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[10];
      System.out.println("enter the array values:");
      for(int i=00;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      Count(arr);
    }
  }