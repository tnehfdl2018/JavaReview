package chap08;

public class OverridingTest1 {

  public static void main(String[] args) {

    Customer customerLee = new Customer(10010, "이순신");
    customerLee.bonusPoint = 1000;


    VIPCustomer customerKim = new VIPCustomer();
    customerKim.bonusPoint = 10000;

    int price = 10000;
    System.out.println(customerLee.customerName + " 님이 지불해야하는 금액은 " + customerLee.calcPoint(price) + "입니다.");
    System.out.println(customerKim.customerName + " 님이 지불해야하는 금액은 " + customerKim.calcPoint(price) + "입니다.");
  }
}
