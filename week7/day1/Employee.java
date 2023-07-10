class Employee1
  {
    String name;
    int id;
    double salary;
   public void talk()
    {
     System.out.println("name is:"+name);
      System.out.println("id is:"+id);
      System.out.println("salary:"+salary);
    }
  }
class Employee
  {
    public static void main(String []args)
    {
      Employee1 e1=new Employee1();
      e1.name="mounika";
      e1.id=1;
      e1.salary=20000;
      e1.talk();
      Employee1 e2=new Employee1();
      e2.name="srinivas";
      e2.id=2;
      e2.salary=25000;
      e2.talk();
    }
  }