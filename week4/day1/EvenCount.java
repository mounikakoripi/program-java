import java.util.Scanner;
class EvenCount
  {
    public static void count(int a[])
    {
      int count=0;
      System.out.println("count of even numbers:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
          count++;
            
          }
        }
      System.out.println(count+" ");
    }
    public static void main(String []args)
    {
      int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
      System.out.println("eneter the elements:");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
          
        }
      count(arr);
    }
  }