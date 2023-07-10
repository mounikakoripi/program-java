class Test
  {
    Test()
    {
      this(10,20);
      System.out.println("i am form default constructor");
    }
  Test(int x)
    {
      this();
      System.out.println("i am single parameter constructor:");
    }
    Test(int x, int y)
    {
      
      System.out.println("iam double parameter constructor:");
    }
  }
class Test1
  {
    public static void main(String []args)
    {
      Test t1=new Test(10);
    }
  }
  