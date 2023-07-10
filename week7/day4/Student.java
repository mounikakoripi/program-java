import java.util.Scanner;
class Student1
  {
    int id;
    String name;
    String address;
    int rollno;
    long mobileno;
    int marks;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
public void setname(String name)
    {
      this.name=name;
    }
    public void setaddress(String address)
    {
      this.address=address;
    }
  public void setrollno(int rollno)
    {
      this.rollno=rollno;
    }
    public void setmarks(int marks)
    {
      this.marks=marks;
    }
    public void setmobileno(long mobileno)
   {
    this.mobileno=mobileno;  
    }
    
  }
class Student
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      Student1[] s=new Student1[6];
      s[0]=new Student1();
      s[1]=new Student1();
      s[2]=new Student1();
      s[3]=new Student1();
      s[4]=new Student1();
      s[5]=new Student1();
      for(int i=0;i<=5;i++)
        {
          System.out.println("enter the student id");
          s[i].id=sc.nextInt();
          System.out.println("enter the student name:");
          s[i].name=sc.next();
          System.out.println("enter the student address");
          s[i].address=sc.next();
          System.out.println("enter the student rollno:");
          s[i].rollno=sc.nextInt();
          System.out.println("eneter the student marks:");
          s[i].marks=sc.nextInt();
          System.out.println("enter the student mobile no:");
          s[i].mobileno=sc.nextLong();
          //sc.nextLine();
        }
      for(int i=0;i<5;i++)
        {
          //sc.nextLine();
          System.out.println("id is:"+s[i].id);
          System.out.println("name is:"+s[i].name);
          System.out.println("address is:"+s[i].address);
          System.out.println("rollno is:"+s[i].rollno);
          System.out.println("marks is:"+s[i].marks);
          System.out.println("mobileno is:"+s[i].mobileno);
          System.out.println("***********");
         // sc.nextLine();
        }
    }
  }
