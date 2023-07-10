class Student
  {
    String name;
    int id;
    String address;
  public void setname(String name)
    {
      this.name=name;
    }
    public void setid(int id)
    {
      this.id=id;
    }
    public void setaddress(String address)
    {
      this.address=address;
    }
    public String getname()
    {
      return name;
    }
    public int getid()
    {
      return id;
    }
    public String getaddress()
    {
      return address;
    }
  }
    public class Studentmain
      {
    public static void main(String []args)
    {
      Student s=new Student();
      s.setname("mounika");
      s.setid(1);
      s.setaddress("xyz");
      System.out.println("name is"+s.getname());
      System.out.println("id is:"+s.getid());
      System.out.println("address is:"+s.getaddress());
      Student s1=new Student();
      s1.setname("sadhvi");
      s1.setid(2);
      s1.setaddress("abc");
      System.out.println("name is:"+s1.getname());
      System.out.println("id is:"+s1.getid());
      System.out.println("address is:"+s1.getaddress());
    }
    }
  
