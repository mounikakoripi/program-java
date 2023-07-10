import java.util.Scanner;

class student {
  String name;
  float fee;
  int id;  
  public void setName(String name) {
    this.name = name;

  }
  public void setfee(float fee) {
    this.fee = fee;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getname() {
    return name;
  }

  public float getfee() {
    return fee;
  }

  public int getid() {
    return id;
  }
}

class StudentDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student s[] = new Student[3];
    s[0]=new Student();
    s[1]=new Student();
    s[2]=new Student();
    for (int i = 0; i < 3; i++) {
      //sc.nextLine();
      System.out.println("enter the student name");
      s[i].name = sc.nextLine();
      System.out.println("enter the student fee:");
      s[i].fee = sc.nextFloat();
      System.out.println("enter the student id");
      s[i].id = sc.nextInt();
        sc.nextLine();
    }
    for (int i = 0; i < 3; i++) {
     // sc.nextLine();
      System.out.println("name is:" + s[i].getname());
      System.out.println("fee is:" + s[i].getfee());
      System.out.println("id is:" + s[i].getid());
    }
  }
}