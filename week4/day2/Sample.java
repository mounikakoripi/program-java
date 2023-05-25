import java.util.Scanner;
class Sample
  {
    public static void main(String []args)
    { 
      int a[]={2,3,4,2,3,5,1};
     System.out.println("unique value");
      for(int i=0;i<a.length;i++)
        {
          int count=0;
        for(int j=i+1;j<a.length;j++)
          {
            if(a[i]==a[j])
            {
               count++;
            }
          }
          if(count==1)
          {
          System.out.println(a[i]+" ");
          }
        }
    }
  }