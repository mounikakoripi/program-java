import java.util.*;
class Employee
  {
    int eid;
    String ename;
    String eaddress;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
   }
class Test5
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      ArrayList a=new ArrayList();
      Employee e1=new Employee();
      Employee e2=new Employee();
      System.out.println("enter the id");
       e1.eid=sc.nextInt();
      System.out.println("enter the name");
      e1. ename=sc.next();
      System.out.println("enter the address");
      e1.eaddress=sc.next();
     a.add(e1);
       System.out.println(a);
      System.out.println(a.size());
      a.add(e2);
      System.out.println(a);
      System.out.println(a.size());
      Iterator itr=a.iterator();
      while(itr.hasNext())
        System.out.println(itr.next()+" ");
    }
  }