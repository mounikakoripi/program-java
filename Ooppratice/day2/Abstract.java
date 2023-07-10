//import com.oracle.truffle.api.impl.asm.AnnotationVisitor;

 abstract class Animal
  {
    public abstract void sound();
    }
class Dog extends Animal{
  public void sound()
  {
    System.out.println("the dog sound is:  boow boow");
  }
  }
class Abstract
  {
    public static void main(String []args)
    {
      Animal obj=new Dog();
      obj.sound();
    }
  }