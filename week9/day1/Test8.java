import java.util.*;
 class Employee2 implements Comparable
  {
    int eno;
    String ename;
    double esalary;
    String eaddre;
    public Employee2(int eno,String ename,double esalary,String eaddre)
    {
      this.eno=eno;
      this.ename=ename;
      this.esalary=esalary;
      this.eaddre=eaddre;
    }
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public String getEaddre() {
		return eaddre;
	}
	public void setEaddre(String eaddre) {
		this.eaddre = eaddre;
	}
    public int compareTo(Object obj)
    {
      Employee2 emp=(Employee2)obj;
      return this.ename.compareTo(emp.ename);
    }
 public String toString()
    {
   return (" "+ this.eno+""+ this.ename +""+ this.esalary +""+  this.eaddre);
    }
  }
class Test8
  {
    public static void main(String []args)
    {
      TreeSet<Employee2> ts=new TreeSet<>();
        Employee2 emp1=new Employee2(11, "mounika", 30.0000, "ong");
      Employee2 emp2=new Employee2(12,"puri",40.0000,"hyd");
      Employee2 emp3=new Employee2(13,"sadhvi",20.0000,"adk");
      Employee2 emp4=new Employee2(14,"chanadna",25.0000,"kdk");
      ts.add(emp1);
      ts.add(emp2);
      ts.add(emp3);
      ts.add(emp4);
      System.out.println(ts);
      for(Employee2 emp:ts)
        {
        System.out.println(emp);
        }
    }
  }