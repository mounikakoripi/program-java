interface Bank
  {
   float rateOfInterest(); 
  }
class HDFC implements Bank
  {
    public float rateOfInterest(){
      return 9.5f;
    }
    }
class SBI implements Bank{
    public float rateOfInterest()
  {
    return 8.6f;
  }
}
class Test1
  {
    public static void main(String []args)
    {
      Bank ob=new SBI();
      HDFC o=new HDFC();
      System.out.println("rate of interest:"+ob.rateOfInterest());
System.out.println("rate of interest:"+o.rateOfInterest());
    }
  }