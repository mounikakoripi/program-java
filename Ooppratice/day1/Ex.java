class Student {
  String name;
  int id;

  public Student(String n, int i) {
    name = n;
    id = i;
  }

  public void talk() {
    System.out.println("name is:" + name);
    System.out.println("id is:" + id);
  }
}

class Ex {
  public static void main(String[] args) {
    Student s1 = new Student("mounika", 1);
    s1.talk();
    Student s2 = new Student("srinivas", 2);
    s2.talk();
  }
}