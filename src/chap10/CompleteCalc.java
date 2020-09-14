package chap10;

public class CompleteCalc extends Calculator{
  @Override
  public int times(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public int divide(int num1, int num2) {
    if (num2 != 0) {
      return num1 / num2;
    } else {
     return Calc.ERROR;
    }
  }

  @Override
  public void description() {
    System.out.println("재정의 잼");
  }

  public void showInfo() {
    System.out.println("Calc 인터페이스를 구현하였습니다.");
  }
}
