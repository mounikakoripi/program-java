class Employee
  {
    String name;
  int id;
    String company="xyz";
    public Employee(String n,int i)
    {
      name=n;
      id=i;
      //company=c;
    }
    public void talk()
    {
      System.out.println("name is:"+name);
      System.out.println("id is:"+id);
     // System.out.println("company is:"+c);
    }
  }
public class Ex1
  {
    public static void main(String []args)
    {
      Employee e1=new Employee("mounika",1);
      e1.talk();
      Employee e2=new Employee("srinivas",2);
      e2.talk();
    }
  }