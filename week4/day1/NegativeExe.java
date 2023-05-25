import java.util.Scanner;
class NegativeExe
  {
    public static void NegativeElement(int a[])
    {
      System.out.println("negative elements:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]+" ");
            
          }
        }
    }
    public static void main(String []args)
    {
      int arr[]=new int[6];
        Scanner sc=new Scanner(System.in);
      System.out.println("enter the array elements:");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      NegativeElement(arr);
    }
  }