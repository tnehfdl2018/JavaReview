package chap10.interfaceExtends;

public class MyClassTest {

  public static void main(String[] args) {
    MyClass myClass = new MyClass();

    myClass.myMethod();
    myClass.x();
    myClass.y();

    X x = new MyClass();
    x.x();

    Y y = new MyClass();
    y.y();

    MyInterface myInterface = new MyClass();
    myInterface.myMethod();
    myInterface.x();
    myInterface.y();


  }
}
