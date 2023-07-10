class Employee
  {
    String name;
    String companyname;
    String addr;
    Employee(String name,String companyname,String addr)
    {
      this.name=name;
    this.companyname=companyname;
    this.addr=addr;
    }
  
 static void print()
  {
  System.out.println("employee details");
  }
 void getEmployeeDetails()
  {
    System.out.println("name is:"+name+" "+"\ncompanyname is:"+companyname+" "+"\naddr is"+addr);
  }
}
class Manager extends Employee{
  String managername=name;
  int id;
  Manager(String name,String companyname,String addr,String managername,int id)
  {
    super(name,companyname,addr);
    this.managername=name;
    this.id=id;
    
  }
  void getManagerDetails()
  {
    super.getEmployeeDetails();
    System.out.println(" manager details");
    System.out.println("managername is:"+name+" "+"\nid is:"+id);
  }
}
class InheritanceSuper
  {
    public static void main(String []args)
    {
      Manager m=new Manager("mounika","xyz","abc","srinivas",1);
      Employee.print();
      m.getManagerDetails();
    }
  }