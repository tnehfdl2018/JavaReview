package chap10.interfaceExtends;

public class MyClass implements MyInterface {
  @Override
  public void myMethod() {
    System.out.println("myMethod(); 상속");
  }

  @Override
  public void x() {
    System.out.println("X(); 상속");
  }

  @Override
  public void y() {
    System.out.println("Y(); 상속");
  }
}
