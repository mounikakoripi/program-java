import java.util.Scanner;
class EvenArr
  {
    public static void EvenArr(int a[])
    {
    System.out.println("even numbers:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]+" ");
          }
        }
    }
    public static void main(String []args)
    {
      int arr[]=new int[10];
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
          
        }
        
        EvenArr(arr);  
   }
  }