//  write a java program to read the array elements and then display the following menu.1. find the sum of array elements2. find the maximum and minimum elements3. reverse the array elements 4. find the prime elements of the array. now read the choice from the user and perform appropriate action
import java.util.Scanner;
class MenuArray
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size:");
      int n=sc.nextInt();
      int a[]=new int[5];
      System.out.println("*****MENU******");
      System.out.println("\n1. find the sum of array elements\n2. find the maximum and minimum elements\n3. reverse the array elements  \n 4. find the prime elements of the array");
      System.out.println("enter the choice:");
      int choice=sc.nextInt();
  System.out.println("enter the array elements:");
      for(int i=0;i<a.length;i++)
        {
         a[i]=sc.nextInt();
        }
      
      switch(choice)
        {
          case 1:
            sum(a);
               break;
          case 2:
            Max(a);
          default:
           Min(a);
          
           // System.out.println("maximum elements is "+a[i]+" minimun elements is"+a[i]);
            break; 
          case 3:
            Reverse(a,n);
               System.out.println("reverse array is:");
      for( int i=0;i<a.length;i++)
        {
             System.out.println(a[i]);
        
          }
            break;
        
      case 4:
        prime(a);
            break;
        }
    }
   public static void  sum(int a[])
    {
      int sum=0;
      for(int i=0;i<a.length;i++)
        sum=sum+a[i];
     System.out.println("sum of array elements:"+sum);
    }
    public static void Max(int a[])
    {
      int max;
    max=a[0];
      for(int i=0;i<a.length;i++)
        {
      if(max<a[i])
      {
        max=a[i];
      }
        }
    System.out.println(max);
      }
    public static void Min(int a[])
    {
      int min;
      min=a[0];
      for(int i=0;i<a.length;i++)
        {
      if(a[i]>min)
      {
        min=a[i];
    }
        }
    System.out.println(min);
}
    public static void Reverse(int arr[],int n)
    {
      int temp,i,j;
      for(i=0,j=(n-1);i<j;i++,j--)
        {
        temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
    }
    public static void prime(int a[])
    { 
      int count=0;
     for(int i=0;i<a.length;i++)
       {
         for(int j=1;j<i;j++)
        {
          if(i%j==0)
          {
            count++;
          }
        }
        if(count==2)
        {
          System.out.println("the number is prime number"+i);
        }
       else
        {
   System.out.println("the number is not prime number:"+i);
    }
       }
    }
}
 