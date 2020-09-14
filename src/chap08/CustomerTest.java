package chap08;

import java.util.ArrayList;

public class CustomerTest {

  public static void main(String[] args) {
    ArrayList<Customer> customers = new ArrayList<>();

    Customer customerLee = new Customer(10010, "이순신");
    Customer customerShin = new Customer(10020, "신사임당");
    Customer customerHong = new GoldCustomer(10030, "홍길동");
    Customer customerYoul = new GoldCustomer(10040, "이율곡");
    Customer customerKim = new VIPCustomer(10050, "김유신", 12345);

    customers.add(customerLee);
    customers.add(customerShin);
    customers.add(customerHong);
    customers.add(customerYoul);
    customers.add(customerKim);

    System.out.println("===== 고객 정보 출력 =====");
    for (Customer customer : customers) {
      System.out.println(customer.showCustomerInfo());
    }
    System.out.println("===== 할인율과 보너스 포인트 계산 =====");
    int price = 10000;
    for (Customer customer : customers) {
      int cost = customer.calcPoint(price);
      System.out.println(customer.getCustomerName() + "님이 " + cost + "지불하였습니다.");
      System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
    }

  }
}
