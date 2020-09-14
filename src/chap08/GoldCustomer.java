package chap08;

public class GoldCustomer extends Customer{

  double saleRatio;


  public GoldCustomer(int customerID, String customName) {
    super(customerID, customName);
    customerGrade = "GOLD";
    bonusRatio = 0.02;
    saleRatio = 0.1;
  }

  @Override
  public int calcPoint(int price) {
    bonusPoint += price * bonusRatio;
    return (int) (price - price * saleRatio);
  }
}
