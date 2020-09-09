package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

  public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
    FileInputStream fileInputStream = new FileInputStream("a.txt");
    Class c = Class.forName(className);
    return c;
  }

  public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
    ThrowsException throwsException = new ThrowsException();
    throwsException.loadClass("a.txt", "java.lang.String");
  }
}
