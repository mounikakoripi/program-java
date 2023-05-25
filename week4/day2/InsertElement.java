import java.util.Scanner;
class InsertElement
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int a[]={23,45,62,90,84};
      int b[]=new int[a.length+1];
      System.out.println("enter the insert element:");
      int value=sc.nextInt();
      System.out.println("enter the index position:");
      int pos=sc.nextInt();
      for(int i=0;i<b.length;i++)
        {
          if(i==pos)
          {
            b[i]=value;
          }
          else if(i>pos)
          {
            b[i]=a[i-1];
          }
          else
          {
            b[i]=a[i];
          }
          }
          System.out.println("the elements array are:");
      for(int i=0;i<b.length;i++)
      System.out.print(b[i]+"   ");
    }
    }