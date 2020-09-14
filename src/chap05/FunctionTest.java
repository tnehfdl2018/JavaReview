package chap05;

public class FunctionTest {

  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    int sum = add(num1, num2);
    int minus = min(num1, num2);
    int multiple = mul(num1, num2);
    int divide = div(num1, num2);

    System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");
    System.out.println(num1 + " - " + num2 + " = " + minus + "입니다.");
    System.out.println(num1 + " * " + num2 + " = " + multiple + "입니다.");
    System.out.println(num1 + " / " + num2 + " = " + divide + "입니다.");
  }

  public static int add(int n1, int n2) {
    int result = n1 + n2;
    return result;
  }

  public static int min(int n1, int n2) {
    int result = n1 - n2;
    return result;
  }

  public static int mul(int n1, int n2) {
    int result = n1 * n2;
    return result;
  }

  public static int div(int n1, int n2) {
    int result = n1 / n2;
    return result;
  }
}
