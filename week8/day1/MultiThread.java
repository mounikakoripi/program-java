class School extends Thread
  {
    public void run()
    {
      System.out.println("fill the formalities");
    }
    public void run(int fee)
    {
       fee=20000;
      System.out.println("first pay the fee");
    }
  }
class MultiThread
  {
    public static void main(String []args)
    {
      School t=new School();
      t.start();
    t.run(15000);
      System.out.println("hello");
    }
  }