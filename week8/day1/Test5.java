class MyThread extends Thread implements Runnable
  {
  public void run()
    {
    for(int i=0;i<10;i++)
      {
        System.out.println("the child class");
      }
    }
  }
class Test5
  {
    public static void main(String []args)
    {
      MyThread t=new MyThread();
      Thread s=new Thread();
      s.start();
      for(int i=0;i<10;i++)
        {
      System.out.println("the main thread");
        }
    }
  }