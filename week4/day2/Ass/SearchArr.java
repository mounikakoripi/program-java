import java.util.Scanner;
class SearchArr
  {
    public static void Search(int a[],int key)
    {
  
      for(int i=0;i<a.length;i++)
        {
          if(a[i]==key)
          {
            System.out.println(i+" present location:");
            break;
          }
        
       }
          }
          public static void main(String []args)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        System.out.println("enter the array elements:");
        int a[]=new int[size];
          for(int i=0;i<a.length;i++)
            {
              a[i]=sc.nextInt();
            }
            System.out.println("to find the array elemenet:");
         int key=sc.nextInt();
       Search(a,key);
    }
  }