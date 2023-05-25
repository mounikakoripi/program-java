//wap a java to sort the interger elements in array
import java.util.Scanner;
class Ass
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size:");
       int n=sc.nextInt();
      int arr[]=new int[5];
      System.out.println("enter the array elements");
       int temp=0;
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc. nextInt();
        }
      for(int i=0;i<arr.length;i++)
        {
          for( int j=i+1;j<arr.length;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
            
          System.out.println("sort the array elements:"+arr[i]);
        
        }   
    }
  }