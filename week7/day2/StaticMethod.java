class Employee
  {
    int id;
    String name;
    static String company="abc";
  Employee(int i,String n)
    {
    this.id=i;
      this.name=n;
    }
   static void change()
    {
      company="xyz";
    }
    void display()
    {
      System.out.println("name is:"+name+ "  "+ "id:"+id+" company:"+company);
      }
  }
class StaticMethod
  {
    public static void main(String []args)
    {
      Employee e1=new Employee(1,"mounika");
      Employee e2=new Employee(2,"mounitha");
      Employee e3=new Employee(3,"srinivas");
      e1.display();
      e2.display();
      e3.display();
      System.out.println("-------");
      Employee.change();
      e1.display();
      e2.display();
      e3.display();
  }
    
  }
