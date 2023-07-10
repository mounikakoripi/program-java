class Student1
  {
    String sname="mounika";
    String scollege="rise";
    String branch="cse";
    void display()
    {
      System.out.println("student details");
    }
     }
class Student2 extends Student1
  {
     //name="mounika;"
  int rollno=585;
  }
class Student3 extends Student1{
  float fee=50000;
}

class Inheritance
  {
    public static void main(String []args)
    {
     System.out.println("student2 details");
      Student2 obj=new Student2();
      System.out.println(obj.sname);
      System.out.println(obj.scollege);
      System.out.println(obj.branch); 
     System.out.println(obj.rollno);
      obj.display();
      System.out.println("stduent3 details:");
      Student3 obj1=new Student3();
      System.out.println(obj1.sname);
     System.out.println(obj1.scollege);
     System.out.println(obj1.branch); 
    //System.out.println(obj1.rollno);
      System.out.println(obj1.fee);
     obj.display();
    }
  }