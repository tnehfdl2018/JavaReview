package chap08;

public class CustomerTest1 {

  public static void main(String[] args) {

    Customer customerLee = new Customer(10010, "이순신");
    customerLee.bonusPoint = 1000;
    System.out.println(customerLee.showCustomerInfo());

    VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 200);
    customerKim.bonusPoint = 1000;
    System.out.println(customerKim.showCustomerInfo());

    System.out.println("===== 할인 율과 보너스 포인트 계산 =====");

    int price = 10000;
    int leePrice = customerLee.calcPoint(price);
    int kimPrice = customerKim.calcPoint(price);

    System.out.println(leePrice + "원 지불");
    System.out.println(customerLee.getCustomerName() + "님의 등급은 " + customerLee.customerGrade + "보너스 포인트는" + customerLee.bonusPoint + "점 입니다.");
    System.out.println(kimPrice + "원 지불");
    System.out.println(customerKim.getCustomerName() + "님의 등급은 " + customerKim.customerGrade + "보너스 포인트는" + customerKim.bonusPoint + "점 이고, 담당 상담원 번호는 " + customerKim.agentID + "입니다.");
  }
}
