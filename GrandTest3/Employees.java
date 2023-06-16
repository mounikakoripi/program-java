/*trChallenge 1:
You are building a payroll system for a company that has two types of employees: salaried employees and hourly employees. The payroll system needs to calculate the monthly salary for each employee based on their specific type and hours worked. Additionally, the system should demonstrate polymorphism by calculating the monthly salary for different types of employees.*/
import java.util.Scanner;
class Employee
  {
    String name;
    int id;
    float salary;
   int Hourly_rate;
    int Hourly_work;
 float  monthly_salary=Hourly_rate+Hourly_work;
  public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public int getHourly_rate() {
	return Hourly_rate;
}
public void setHourly_rate(int hourly_rate) {
	Hourly_rate = hourly_rate;
}
public int getHourly_work() {
	return Hourly_work;
}
public void setHourly_work(int hourly_work) {
	Hourly_work = hourly_work;
}
  public float getmonthly_salary()
    {
      return monthly_salary;
    }
    public void setmonthly_salary(float monthly_salary){
      monthly_salary=monthly_salary;
    }
} 
class Employees
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
    Employee e[]=new Employee[2];
      e[0]=new Employee();
      e[1]=new Employee();
      for(int i=0;i<2;i++)
        {
          System.out.println("enter the employee id:");
          e[i].id=sc.nextInt();
          System.out.println("enter the employee name:");
          e[i].name=sc.next();
          System.out.println("enter monthly salary:");
          e[i].salary=sc.nextFloat();
          System.out.println("enter the hourly rate:");
          e[i].Hourly_rate=sc.nextInt();
          System.out.println("enter the hourly worked:");
          e[i].Hourly_work=sc.nextInt();
          System.out.println("salary");
          e[i].salary=sc.nextInt();
        }
for(int i=0;i<=2;i++)
  {
    int Hourly_rate;
    int Hourly_work;
    System.out.println("employee id is:"+e[i].id);
    System.out.println("employee name is:"+e[i].name);
    System.out.println("employee salary is:"+e[i].salary);
    float  monthly_salary=Hourly_rate+Hourly_work;
    System.out.println("employee Monthly_salary is:"+e[i].monthly_salary);
    
  }
   }
 }