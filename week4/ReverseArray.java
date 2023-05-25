//wap to the array elements reverse
import java.util.Scanner;
class ReverseArray
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size:");
      int n=sc. nextInt();
   int  arr[]=new int[5];
      System.out.println("enter the array elements:");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();

        }
      ReverArr ra=new  ReverArr();
      ra.reverse(arr,n);
      for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]);
        }
    }
  }
class ReverArr
  {
    public int[] reverse(int arr[], int n)
    {
      int temp=0;
      for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length;j--)
            {
           temp=arr[i];
                arr[i]=arr[j];
                arr[j]=arr[i];
              }
              }
           
      return arr;
    }
  }